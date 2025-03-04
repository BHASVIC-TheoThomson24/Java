public class Rook extends Piece {
    public Rook(char row, int col, String colour, Board board) {
        super(row, col, colour, board);
        type='R';
    }

    protected boolean checkMove(char row, int column) {
        boolean valid=true;
        if(row!=this.row && column!=this.column){
            valid=false;
        }
        return valid;
    }
}
