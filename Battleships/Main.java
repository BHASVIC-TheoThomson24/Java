public class Main {
    public Main() {
        boolean widthSet = false;
        boolean heightSet = false;
        int width = 10;
        int height = 10;

        while (!widthSet)
            try {
                System.out.print("Enter the width of your game board (10-26):");
                width = Integer.parseInt(Console.readLine());
                System.out.println();
                if (width >= 10 && width <= 26)
                    widthSet = true;
                else
                    System.out.println("The width must be an integer from 10-26. Please try again.");
            }
            catch(Exception e) {
                System.out.println("The width must be an integer from 10-26. Please try again.");
            }

        while (!heightSet) {
            try{
                System.out.print("Enter the height of your game board (10-26):");
                height = Integer.parseInt(Console.readLine());
                System.out.println();
                if (height >= 10 && height <= 26)
                    heightSet = true;
                else
                    System.out.println("The height must be an integer from 10-26. Please try again.");
            }
            catch(Exception e) {
                System.out.println("The height must be an integer from 10-26. Please try again.");
            }
        }

        HumanPlayer player1 = new HumanPlayer(1, width, height);
        ComputerPlayer player2 = new ComputerPlayer(2, width, height);
        Board board1 = player1.getBoard();
        Board board2 = player2.getBoard();

        for(int i=0;i<4;i++){
            board1.display(1);
            System.out.println("Please enter the column of the bottom left co-ordinate of your ship");
            int column= Integer.parseInt(Console.readLine());
            System.out.println("Please enter the row of the bottom left co-ordinate of your ship");
            char row= Character.toUpperCase(Console.readLine().charAt(0));
            System.out.println("Please enter the orientation (h/v)");
            char orientation= Character.toUpperCase(Console.readLine().charAt(0));
                board1.addShip(column,row,i+2, orientation);
        }

        while (true) {
            System.out.println();
            System.out.println("It's your turn:");
            boolean makeShot = false;
            while (!makeShot) {
                System.out.println(
                        "Would you like to take a shot(1), look at the computer's board(2), or look at your board(3)?:");
                String result = Console.readLine();
                System.out.println();
                if (result.equals("1"))
                    makeShot = true;
                else if (result.equals("2"))
                    board2.display(player1.getNumber());
                else if (result.equals("3"))
                    board1.display(player1.getNumber());
                else
                    System.out.println("That is not a valid option!");
            }
            board2.display(player1.getNumber());
            player1.takeShot(board2);
            if (board2.checkWinner()) {
                System.out.println();
                board2.display(player1.getNumber());
                System.out.println("You have won!");
                Console.readLine();
                return;
            }
            System.out.println();
            System.out.println("It's the computer's turn:");
            player2.takeShot(board1);
            board1.display(player1.getNumber());
            if (board1.checkWinner()) {
                System.out.println();
                System.out.println("You have lost!");
                Console.readLine();
                return;
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}