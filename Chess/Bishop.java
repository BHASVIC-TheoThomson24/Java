public class Bishop extends Piece {
    public Bishop(char row, int col,Player player,Board board) {
        super(row, col, player, board);
        type='B';
    }

    protected boolean checkMove(char row, int column) {
        boolean valid=true;
        int dy=row-this.row;
        int dx=column-this.column;
        if(Math.abs(dy)!=Math.abs(dx)){
            valid=false;
        }
        for(int i=1;i<=dx;i++){
            if(board.getPiece((char)(this.row+i*Math.signum(dy)), (int) (this.column+i*Math.signum(dx)))!=null){
                valid=false;
            }
        }
        return valid;
    }
}
