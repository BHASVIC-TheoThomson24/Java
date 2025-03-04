public class Pawn extends Piece {
    int moves=0;
    public Pawn(char row, int col,String colour,Board board) {
        super(row,col,colour,board);
        type='P';
    }
    protected boolean checkMove(char row, int column){
        boolean valid=true;
        int moveDirection = switch (this.colour) {
            case "White" -> 1;
            case "Black" -> -1;
            default -> 0;
        };
        if(row==this.row+moveDirection){
            if(column!=this.column && column!=this.column-1 && column!=this.column+1){
                valid=false;
            }
            //Can only take diagonally if there is a piece to take
            else if(column==this.column-1 || column==this.column+1){
                if(board.getPiece(row,column)==null){
                    valid=false;
                }
            }
        }
        //Only moves more than 1 row if it is first turn
        else if(! ((row==(this.row+2*moveDirection)) && (moves==0) && column==this.column)){
            valid=false;
        }
        //Pawns cannot move through a piece
        else{
            if(board.getPiece((char)(row+moveDirection),column)!=null){
                valid=false;
            }
        }
        return valid;
    }
    public void move() {
     super.move();
     moves+=1;
    }


}