public class King extends Piece {
    public King(char row, int col, Player player, Board board){
        super(row, col, player, board);
        type='K';
    }

    protected boolean checkMove(char row, int column) {
        boolean valid=true;
        int dx=column-this.column;
        int dy=row-this.row;
        if(Math.abs(dx)>1 || Math.abs(dy)>1){
            valid=false;
        }
        return valid;
    }
    public boolean isInCheck(){
        boolean check=false;
        //Check for pawns
        int moveDirection = switch (this.colour) {
            case "White" -> 1;
            case "Black" -> -1;
            default -> 0;
        };
        Piece piece;
        for(int i=0;i<=1;i++){
            piece=board.getPiece((char) (row+moveDirection), (int) (column+Math.pow(-1,i)));
            if(piece!=null){
                if(piece.getType()=='P' && piece.getColour()!=this.colour){
                    check=true;
                }
            }
        }
        //Check for knights
        for(int i=0;i<4;i++){
            int dx=(int)(Math.pow(-1,i)*switch(i/2){
                case 0 -> 2;
                case 1 -> 3;
                default -> -1;
            });
            for(int j=0;j<2;j++){
                int dy= (int) (Math.pow(-1,j)*(3-Math.abs(dx)));
                piece=board.getPiece((char) (row+dy),column+dx);
                if(piece!=null){
                    if(piece.getType()=='N' && piece.getColour()!=this.colour){
                        check=true;
                    }
                }
            }
        }
        //Check for rooks and queens in a straight line
        for(int i=0;i<8;i++){
            piece=board.getPiece((char) (row),i+1);
            if(piece!=null){
                if((piece.getType()=='R' || piece.getType()=='Q') && piece.getColour()!=this.colour){
                    //Check for pieces in the way to block the check
                    if(piece.checkMove(row,column)){
                        check=true;
                    }
                }
            }
            piece=board.getPiece((char) (i+65),column);
            if(piece!=null){
                if((piece.getType()=='R' || piece.getType()=='Q') && piece.getColour()!=this.colour){
                    //Check for pieces in the way to block the check
                    if(piece.checkMove(row,column)){
                        check=true;
                    }
                }
            }
        }
        //Check for bishops and queens in a diagonal
        for(int i=-7;i<8;i++){
            piece=board.getPiece((char) (row+i),column+i);
            if(piece!=null){
                if((piece.getType()=='B' || piece.getType()=='Q') && piece.getColour()!=colour){
                    if(piece.checkMove(row,column)){
                        check=true;
                    }
                }
            }
            piece=board.getPiece((char) (row-i),column+i);
            if(piece!=null){
                if((piece.getType()=='B' || piece.getType()=='Q') && piece.getColour()!=colour){
                    if(piece.checkMove(row,column)){
                        check=true;
                    }
                }
            }
        }

        return check;
    }
}
