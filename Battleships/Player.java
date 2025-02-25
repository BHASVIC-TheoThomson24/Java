public class Player {
    int num=0;
    int width=0;
    int height=0;
    Board board;
    public Player(int numInput,int widthInput,int heightInput) {
        num=numInput;
        width=widthInput;
        height=heightInput;
        board=new Board(this,width,height);
    }
    public int getNumber() {
        return num;
    }
    public void takeShot(Board board) {
        int column=0;
        while(column==0){
            try{
                column=Integer.parseInt(Console.readLine());
            }
            catch(Exception e){
                System.out.println("Invalid column, please try again:");
            }
        }
        char row=0;
        while(row==0) {
            try {
                row = Console.readLine().charAt(0);
            } catch (Exception e) {
                System.out.println("Invalid column, please try again:");
            }
        }
        row=Character.toUpperCase(row);
        board.takeShot(column,row);
    }
    public Board getBoard() {
        return board;
    }

}
