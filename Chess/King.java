public class King extends Piece {
    public King(char row, int col, String colour, Board board){
        super(row, col, colour, board);
        type='K';
    }

    protected boolean checkMove(char row, int column) {
        boolean valid=true;
        int dx=this.column-column;
        int dy=this.row-row;
        if(dx<-1 || dx>1 || dy<-1 || dy>1){
            valid=false;
        }
        return valid;
    }
}
