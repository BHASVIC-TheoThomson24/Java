public class Rook extends Piece {
    public Rook(char row, int col, Player player, Board board) {
        super(row, col, player, board);
        type='R';
    }

    protected boolean checkMove(char row, int column) {
        boolean valid=true;
        if(row!=this.row && column!=this.column){
            valid=false;
        }
        else if(row!=this.row){
            int dy=row-this.row;
            for(int i=1;i<=Math.abs(dy);i++){
                if(board.getPiece((char) (this.row+i*Math.signum(dy)),this.column)!=null){
                    valid=false;
                }
            }
        }
        else{
            int dx=column-this.column;
            for(int i=1;i<=Math.abs(dx);i++){
                if(board.getPiece(this.row, (int) (this.column+i*Math.signum(dx)))!=null){
                    valid=false;
                }
            }
        }
        return valid;
    }
}
