public class Piece {
    char type;
    String colour;
    Board board;
    char row=0;
    int column=0;

    public Piece(char row, int column, String colour, Board board) {
        this.colour = colour;
        this.board = board;
        this.row=row;
        this.column=column;
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
                board.set(row, column, this);
            }
        }
    }
    private boolean checkValid(char row, int column) {
        boolean valid = false;
    }
}
