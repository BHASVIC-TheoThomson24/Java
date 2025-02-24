public class Player {
    private String name;
    private int number;
    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public void makeMove(Board board){
        String moveString;
        int move;
        int valid=-1;
        while(valid == -1){
            move=-1;
            while(move<1 || move>board.getWidth()){
                System.out.print("Enter column number: ");
                moveString=Console.readLine();
                move=Integer.parseInt(moveString);
            }
            move--;
            valid=board.addToken(move,number);
            if(valid==-1){
                System.out.println("Entered column is full, please choose a different column");
            }
        }
    }
}
