import java.util.ArrayList;

public class Board {
    private ArrayList<Character> board;
    private int width=0;
    private int height=0;
    public Board(Player playerInput,int widthInput, int heightInput){
        width = widthInput;
        height = heightInput;
        board=new ArrayList<>(width*height);
    }
    public void takeShot(int column, char row){

    }
    public void display(int playerNum) {
        boolean showShips=false;
        if(playerNum==1){
            showShips=true;
        }
        String row="";
        int count=1;
        System.out.print(" ");
        while(count<=width){
            System.out.print(count/10);
            count++;
        }
        System.out.println();
        System.out.print(" ");
        count=1;
        while(count<=width){
            System.out.print(count%10);
            count++;
        }
        System.out.println();
        for(int i=0; i<height; i++){
            row="";
            row+=(char) (65+i);
            for(int j=0; j<width; j++){
                try {
                    row += board.get(i * width + j) + " ";
                }
                catch(Exception e){
                    row+= "-";
                }
            }
            System.out.println(row);
        }

    }
    public Boolean checkWinner(){
        return false;
    }
    public void addShip(int column, char row, int length,char orientation){
        //horizontal
        if(orientation == (char) 104){
            for(int i=0; i<length; i++){
            }
        }
        else{

        }



    }
}
