public class Queen extends Piece {
    public Queen(char row, int col, String colour, Board board) {
        super(row, col, colour, board);
        type='Q';
    }

    protected boolean checkMove(char row, int column) {
        boolean valid = true;
        int dy=this.row-row;
        if(dy<0){
            dy*=-1;
        }
        int dx=this.column-column;
        if(dx<0){
            dx*=-1;
        }
        if(row!=this.row && column!=this.column && dy!=dx){
            valid = false;
        }
        return valid;
    }
}
