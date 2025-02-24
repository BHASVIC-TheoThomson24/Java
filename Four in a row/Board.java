import java.util.ArrayList;

public class Board {
    private int width;
    private int height;
    private ArrayList<Column> board;
    public Board(int columns, int rows) {
        this.width = columns;
        this.height = rows;
        board = new ArrayList<Column>(width);
        for (int i = 0; i < width; i++) {
            Column c = new Column(height);
            board.add(c);
        }
    }
    public int addToken(int column, int playerNum){
        Column c = board.get(column);
        return c.addToken(playerNum);

    }
    public void display(){
        String row="";
        for (int i = height-1; i >=0; i--) {

            for (int j = 0; j < width; j++) {
                Column c = board.get(j);
                String token=String.valueOf(c.getToken(i));
                row=row.concat(token);
            }
            System.out.println(row);
            row="";
        }
    }
    public Player checkWon(){
        Player winner = null;
        if(checkVertical()!=null) {
            winner = checkVertical();
        }
        else if(checkHorizontal()!=null) {
            winner = checkHorizontal();
        }
        return winner;
    }
    private Player checkHorizontal(){
        Player winner = null;
        int row=0;
        int length=0;
        int playerNum=0;
        Column c;
        while(winner==null && row<height){
            for(int i=0;i<width;i++){
                c=board.get(i);
                if(c.getToken(row) == playerNum){
                  length++;
                }
                else{
                    playerNum=c.getToken(row);
                    length=1;
                }
                if(length==4 && playerNum!=0){
                    winner=Main.getPlayers().get(playerNum-1);
                }
            }
            row++;
        }
        return winner;
    }
    private Player checkVertical(){

        Player winner = null;
        int column=0;
        Column c;
        //length of line of one player's tokens
        int length=0;
        int playerNum=0;
        while(winner == null && column < width){
            c=board.get(column);
            for(int i=0;i< height ;i++){
                if(c.getToken(i) == playerNum){
                    length++;
                }
                else{
                    length=1;
                    playerNum=c.getToken(i);
                }
                if(length==4 && playerNum!=0){
                    winner=Main.getPlayers().get(playerNum-1);
                }
            }
            column++;
        }
        return winner;
    }
    private Player checkDiagonal(){
        Player winner = null;
        int column=0;
        int row=0;
        Column c;
        for(int i=0;i< height-3 ;i++){
            for(int j=0;j<width-3 ;j++){
                
            }
        }
        return winner;
    }

    public boolean boardFull(){
        int column =-1;
        do {
            column+=1;
            Column c = board.get(column);
            if (!(c.isFull())) {
                return false;
            }
        }while(column<width-1);
        return true;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
}

