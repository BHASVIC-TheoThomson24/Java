public class Board {
    Piece[][] board=new Piece[8][8];
    public Board() {
        String rank0="RNBQKBNR";
        for(int i=0;i<8;i++){
            switch(rank0.charAt(i)){
                case 'R': board[0][i]=new Rook('A', i, "White", this);
                board[7][i]=new Rook('H', i, "Black", this);
                break;
                case 'B': board[0][i]=new Bishop('A',i,"White", this);
                board[7][i]=new Bishop('H',i,"Black", this);
                break;
                case 'N': board[0][i]=new Knight('A',i,"White", this);
                board[7][i]=new Knight('H',i,"Black", this);
                break;
                case 'Q': board[0][i]=new Queen('A',i,"White",this);
                board[7][i]=new Queen('H',i,"Black", this);
                break;
                case 'K': board[0][i]= new King('A',i,"White",this);
                board[7][i]=new King('H',i,"Black", this);
                break;
                board[1][i]=new Pawn('P',"White",this);
                board[6][i]=new Pawn('P',"Black",this);
            }
        }
    }
    public void display(){
        System.out.println("  12345678");
        for(int i=0; i<8; i++){
            System.out.print( (char)(65+i) );
            System.out.print(" ");
            for(int j=0; j<8; j++){
                if(board[i][j]==null){
                    System.out.print("-");
                }
                else {
                    System.out.print(board[i][j].getType());
                }
            }
            System.out.println();
        }
    }
    public Piece getPiece(char row, int column){
        return board[row-65][column-1];
    }
    public boolean movePiece(Piece piece, int row, int column){
        if(board[row][column]==null){
            board[row][column]=piece;
            return true;
        }
        return false;

    }
    public void clear(char row, int column){
        board[(row-65)][column-1]=null;
    }
    public void set(int row, int column, Piece piece){
        board[row][column]=piece;
    }
}
