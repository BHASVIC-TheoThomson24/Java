public class Bishop extends Piece {
    public Bishop(char row, int col,String colour,Board board) {
        super(row, col, colour, board);
        type='B';
    }

    protected boolean checkMove(char row, int column) {
        boolean valid=true;
        int dy=this.row-row;
        int dx=this.column-column;
        if(dy!=dx && dy!=-dx){
            valid=false;
        }
        return valid;
    }
}
