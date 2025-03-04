public abstract class Piece {
    char type;
    String colour;
    Board board;
    char row=0;
    int column=0;

    public Piece(char row, int column, String colour, Board board) {
        this.colour = colour;
        this.board = board;
        this.row=row;
        this.column=column+1;
    }

    public char getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public void move() {
        boolean valid = false;
        while (!valid) {
            char row = 0;
            while (row < 'A' || row > 'H') {
                System.out.println("Enter row to move to:");
                row = Console.readLine().charAt(0);
                row = Character.toUpperCase(row);
            }
            int column = 0;
            while (column < 1 || column > 8) {
                System.out.println("Enter column to move to");
                column = Integer.parseInt(Console.readLine());
            }
            valid=checkValid(row,column);
            if (valid) {
                this.row=row;
                this.column=column;
                board.set(this.row, this.column, this);
            }
            else{
                System.out.println("Invalid cell selected. Please try again.");
            }
        }
    }
    protected boolean checkValid(char row, int column) {
        boolean valid = true;
        //Cannot move to a square with one of your pieces on it
        Piece piece=board.getPiece(row,column);
        if(piece!=null){
            if(piece.getColour().equals(this.colour)){
                valid=false;
            }
        }
        else if(!checkMove(row, column)){
         valid=false;
        }
        return valid;
    }
    protected abstract boolean checkMove(char row, int column);
}
