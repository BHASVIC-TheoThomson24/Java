public class Main {

    public Main() {
        Board board = new Board();
        board.display();
        HumanPlayer white = new HumanPlayer("White");
        HumanPlayer black = new HumanPlayer("Black");
        boolean gameOver = false;

        while (!gameOver) {
            System.out.println();
            System.out.println("It's White's turn to move:");
            gameOver = white.movePiece(board);
            board.display();
            if (gameOver)
                break;
            System.out.println();
            System.out.println("It's Black's turn to move:");
            gameOver = black.movePiece(board);
            board.display();
        }
        board.display();
        Console.readLine();
    }

    public static void main(String[] args) {
        new Main();
    }
}