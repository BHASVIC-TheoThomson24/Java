public class Knight extends Piece{
    public Knight(char row, int column, Player player, Board board){
        super(row, column, player, board);
        type='N';
    }

    protected boolean checkMove(char row, int column) {
        boolean valid=true;
        int dy=Math.abs(row-this.row);
        int dx=Math.abs(column-this.column);
        if(dx+dy!=3 || (dx!=2 && dy!=2)){
            valid=false;
        }
        return valid;
    }
}
