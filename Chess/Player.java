import java.util.ArrayList;

public class Player {
    String colour;
    ArrayList<Piece> pieces=new ArrayList<Piece>();
    public Player(String colour) {
        this.colour = colour;
    }
    public boolean movePiece(Board board){
        boolean valid = false;
        while(!valid) {
            char row=0;
            while(row<'A' || row> 'H') {
                System.out.println("Enter the row of the piece to move");
                row = Character.toUpperCase(Console.readLine().charAt(0));
            }
            int column=0;
            while(column<1 || column>8) {
                System.out.println("Enter the column of the piece to move:");
                 column = Integer.parseInt(Console.readLine());
            }
            if(board.getPiece(row,column)==null || !board.getPiece(row, column).getColour().equals(colour)) {
                System.out.println("Invalid piece");
                valid = false;
            }
            else{
                valid = true;
                board.getPiece(row,column).move();
                board.clear(row,column);
            }
        }

        return false;
    }
    public String getColour() {
        return colour;
    }
    public void addPiece(Piece piece) {
        pieces.add(piece);
    }
    public King getKing(){
        King king=null;
        for(Piece piece : pieces) {
            if(piece.getType()=='K'){
                king= (King) piece;
            }
        }
        return king;
    }
}
