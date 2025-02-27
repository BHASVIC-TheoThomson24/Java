import java.lang.reflect.Array;
import java.util.ArrayList;

public class Board {
    private char[][] board;
    private int width=0;
    private int height=0;
    private int num=0;
    private int hits=0;
    public Board(int playerNum,int widthInput, int heightInput){
        width = widthInput;
        height = heightInput;
        board = new char[width][height];
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                board[i][j] = '-';
            }
        }
        num=playerNum;
    }
    public void takeShot(int column, char row){
        row-=97;
        column-=1;
        if(board[column][row]=='-'){
            System.out.println("Miss!");
            board[column][row] = 'O';
        }
        else if(board[column][row]=='s'){
            System.out.println("Hit!");
            board[column][row] = 'X';
            hits++;
        }
    }
    public void display(int playerNum) {
        boolean showShips = false;
        if (playerNum == num) {
            showShips = true;
        }
            String row = "";
            int count = 1;
            System.out.print(" ");
            while (count <= width) {
                System.out.print(count / 10);
                count++;
            }
            System.out.println();
            System.out.print(" ");
            count = 1;
            while (count <= width) {
                System.out.print(count % 10);
                count++;
            }
            System.out.println();
            for (int i = 0; i < height; i++) {
                row = "";
                row += (char) (65 + i);
                for (int j = 0; j < width; j++) {
                    if (board[j][i] != 's' || showShips) {
                        row += board[j][i];
                    } else {
                        row += '-';
                    }
                }
                System.out.println(row);
            }

    }
    public Boolean checkWinner(){
        return hits == 14;
    }
    public boolean addShip(int column, char row, int length,char orientation){
        //horizontal
        if(orientation == 'h'){
            //check if it is valid
            if(column+length-1>width){
                return false;
            }
            for(int i=0;i<length;i++){
                if(board[column+i-1][row-97]=='s'){
                    return false;
                }
            }
            //add ship
            for(int i=0; i<length; i++){
                board[column+i-1][row-97]='s';
            }
        }
        else{
            if(row-97+1+length-1>height){
                return false;
            }
            for(int i=0; i<length; i++){
                if(board[column-1][row-97+i]=='s'){
                    return false;
                }
            }
            for(int i=0; i<length; i++){
                board[column-1][row-97+i]='s';
            }

        }
        return true;


    }
    public int getWidth(){
        return width;
    }
}
