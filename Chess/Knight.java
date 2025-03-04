public class Knight extends Piece{
    public Knight(char row, int column, String colour, Board board){
        super(row, column, colour, board);
        type='N';
    }

    protected boolean checkMove(char row, int column) {
        boolean valid=true;
        int dy=row-this.row;
        int dx=column-this.column;
        if(dx<0){
            dx=-dx;
        }
        if(dy<0){
            dy=-dy;
        }
        if(dx+dy!=3){
            valid=false;
        }
        return valid;
    }
}
