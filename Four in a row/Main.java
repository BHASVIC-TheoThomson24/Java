import java.util.*;

public class Main {
    private static ArrayList<Player> players = new ArrayList<Player>();
    public Main() {
        boolean widthSet = false;
        boolean heightSet = false;
        int width = 0;
        int height = 0;

        while (!widthSet) {
            try {
                System.out.print("Enter the width of your game board (4-10):");
                width = Integer.parseInt(Console.readLine());
                System.out.println();
                if (width >= 4 && width <= 10)
                    widthSet = true;
                else
                    System.out.println("The width must be an integer from 4-10. Please try again.");
            }
            catch(Exception e) {
                System.out.println("The width must be an integer from 4-10. Please try again.");
            }
        }

        while (!heightSet) {
            try {
                System.out.print("Enter the height of your game board (4-10):");
                height = Integer.parseInt(Console.readLine());
                System.out.println();
                if (height >= 4 && height <= 10)
                    heightSet = true;
                else
                    System.out.println("The height must be an integer from 4-10. Please try again.");
            }
            catch(Exception e) {
                System.out.println("The height must be an integer from 4-10. Please try again.");
            }
        }

        Board board = new Board(width, height);
        boolean allPlayersAdded = false;
        Player player = new Player("Nobody", 0);
        String name = "Nobody";

        while (!allPlayersAdded) {
            boolean validName = false;
            while (!validName) {
                System.out.print("Enter this player's name:");
                name = Console.readLine();
                System.out.println();
                validName = true;
                for (int p = 0; p < players.size(); p++) {
                    player = players.get(p);
                    if (player.getName().equals(name)) {
                        validName = false;
                        System.out.println("There is already a player called " + name + ". Please try again.");
                    }
                }
                if (name.equals("Nobody")) {
                    validName = false;
                    System.out.println("You can't use the name \"Nobody\". Please try again.");
                }
            }

            Player newPlayer = new Player(name, players.size() + 1);
            players.add(newPlayer);
            System.out.println("Player " + newPlayer.getNumber() + " is: " + name);
            System.out.println();

            String addMore;
            if (players.size() > 1 && players.size() < 4) {
                System.out.print("Keep adding players (y/n)?:");
                addMore = Console.readLine().toLowerCase();
                System.out.println();
                if (!addMore.equals("y") && !addMore.equals("yes")) {
                    allPlayersAdded = true;
                }
            }
            else if (players.size() == 4)
                allPlayersAdded = true;
        }

        System.out.println("This game has " + players.size() + " players:");
        for (int p = 0; p < players.size(); p++) {
            player = players.get(p);
            System.out.println(player.getName());
        }

        boolean gameOver = false;
        Player winner=null;

        while (!gameOver) {
            for (int p = 0; p < players.size(); p++) {
                player = players.get(p);
                System.out.println();
                System.out.println(player.getName() + ", it's your turn:");
                board.display();
                player.makeMove(board);
                winner = board.checkWon();
                if (winner != null  || board.boardFull()) {
                    gameOver = true;
                    break;
                }
            }
        }
        board.display();
        assert winner != null;
        System.out.println(winner.getName() + " wins the game!");
        Console.readLine();
    }
    public static ArrayList<Player> getPlayers() {
        return players;
    }

    public static void main(String[] args) {
        new Main();
    }
}