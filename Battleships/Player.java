import java.util.Random;

public class Player {
    int num=0;
    int width=0;
    int height=0;
    Board board;
    public Player(int numInput,int widthInput,int heightInput) {
        num=numInput;
        width=widthInput;
        height=heightInput;
        board=new Board(num,width,height);
    }
    public int getNumber() {
        return num;
    }
    public void takeShot(Board board) {
        int column=0;
        char row=0;
        if(num==1) {
            while (column < 1 || column > width) {
                try {
                    System.out.println("Please enter a column");
                    column = Integer.parseInt(Console.readLine());
                } catch (Exception e) {
                    System.out.println("Invalid column, please try again:");
                }
            }
            while (row < 97 || row > 97 + height - 1) {
                try {
                    System.out.println("Please enter a row");
                    row = Console.readLine().charAt(0);
                } catch (Exception e) {
                    System.out.println("Invalid column, please try again:");
                }
            }
        }
        else{
            Random rand=new Random();
            column=rand.nextInt(width)+1;
            row=(char) (rand.nextInt(height)+97);
        }
        row=Character.toLowerCase(row);
        board.takeShot(column,row);
    }
    public Board getBoard() {
        return board;
    }

}
