public class Queen extends Piece {
    public Queen(char row, int col, Player player, Board board) {
        super(row, col, player, board);
        type='Q';
    }

    protected boolean checkMove(char row, int column) {
        boolean valid = true;
        int dy=row-this.row;
        int dx=column-this.column;
        //Cannot move diagonally through pieces
        if(Math.abs(dx)==Math.abs(dy)){
            for(int i=1;i<=Math.abs(dx);i++){
                if(board.getPiece((char)(this.row+i*Math.signum(dy)), (int) (this.column+i*Math.signum(dx)))!=null){
                    valid=false;
                }
            }
        }
        else if(dx==0){
            for(int i=1;i<=Math.abs(dy);i++){
                if(board.getPiece((char)(this.row+i*Math.signum(dy)),this.column)!=null){
                    valid=false;
                }
            }
        }
        else if(dy==0){
            for(int i=1;i<=Math.abs(dx);i++){
                if(board.getPiece((this.row), (int) (this.column+i*Math.signum(dx)))!=null){
                    valid=false;
                }
            }
        }
        if(row!=this.row && column!=this.column && Math.abs(dy)!=Math.abs(dx)){
            valid = false;
        }
        return valid;
    }
}
