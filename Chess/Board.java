public class Board {
    Piece[][] board=new Piece[8][8];
    public Board() {
        String rank0="RNBQKBNR";
        for(int i=0;i<8;i++){
            switch(rank0.charAt(i)){
                case 'R': board[0][i]=new Rook('A', i, Main.white, this);
                board[7][i]=new Rook('H', i, Main.black, this);
                break;
                case 'B': board[0][i]=new Bishop('A',i,Main.white, this);
                board[7][i]=new Bishop('H',i,Main.black, this);
                break;
                case 'N': board[0][i]=new Knight('A',i,Main.white, this);
                board[7][i]=new Knight('H',i,Main.black, this);
                break;
                case 'Q': board[0][i]=new Queen('A',i,Main.white,this);
                board[7][i]=new Queen('H',i,Main.black, this);
                break;
                case 'K': board[0][i]= new King('A',i,Main.white,this);
                board[7][i]=new King('H',i,Main.black, this);
                break;
            }
            board[1][i]=new Pawn('B',i,Main.white,this);
            board[6][i]=new Pawn('G',i,Main.black,this);
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
        try{
            return board[row-65][column-1];
        }catch (Exception e){
            return null;
        }
    }
    public void set(char row, int column, Piece piece){
        board[row-65][column-1]=piece;
    }
    public void clear(char row,int column){
        board[row-65][column-1]=null;
    }
}
