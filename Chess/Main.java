public class Main {

    public static HumanPlayer white = new HumanPlayer("White");
    public static HumanPlayer black = new HumanPlayer("Black");
    public Main() {
        Board board = new Board();
        board.display();
        boolean gameOver = false;

        while (!gameOver) {
            System.out.println();
            System.out.println("It's White's turn to move:");
            gameOver = white.movePiece(board);
            if(black.getKing().isInCheck()){
                System.out.println("Check!");
            }
            board.display();
            if (gameOver)
                break;
            System.out.println();
            System.out.println("It's Black's turn to move:");
            gameOver = black.movePiece(board);
            if(white.getKing().isInCheck()){
                System.out.println("Check!");
            }
            board.display();
        }
        board.display();
        Console.readLine();
    }

    public static void main(String[] args) {
        new Main();
    }
}