import java.util.ArrayList;

public class Column {
    private ArrayList<Integer> tokens=new ArrayList<>();
    private int height;
    public Column(int height){
        this.height=height;
    }
    public int addToken(int playerNum){
        if(!isFull()) {
            tokens.add(playerNum);
            return playerNum;
        }
        else{
            return -1;
        }
    }
    public int getToken(int heightInput){
        if(tokens==null){
            return 0;
        }
        else if(tokens.size()<=heightInput){
            return 0;
        }
        return tokens.get(heightInput);
    }
    public boolean isFull(){
        return tokens.size()==height;
    }
}
