import java.util.ArrayList;
import java.util.Scanner;


public class TicTacToe {

    static ArrayList<Integer> playerPosition1 = new ArrayList<>();
    static ArrayList<Integer> playerPosition2 = new ArrayList<>();

    public static void main(String[] args) {


        while(true) {
                introMenu();
                playerMove();
        }


    }



    public static void introMenu() {

        System.out.println("*===================================*");
        System.out.println("Hello & welcome to my TicTacToe-game!");
        System.out.println("How to play: Enter a number (1-9) and it will place an X/O in the square that you'll choose.");
        System.out.println("*==============================*");
        System.out.println("""
                {'1', '|', '2', '|', '3'},
                {'4', '|', '5', '|', '6'},
                {'7', '|', '8', '|', '9'},""");
        System.out.println("*==============================*");
        System.out.println("Player 1 is X, Player 2 is O.");
        System.out.println("But first, enter your name! Good luck! ");
        System.out.println("*===================================*");

    }


    public static void playerMove() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter player 1 name: ");
        String player1 = sc.nextLine();
        System.out.println("Enter player 2 name: ");
        String player2 = sc.nextLine();

        Board.printBoard();


        // *===========================================* Game begins

        while (true) {

            System.out.println(player1 + " enter your placement (1-9): ");     // Player 1 enters a placement
            int playerPos1 = sc.nextInt();


            while (playerPosition1.contains(playerPos1) || playerPosition2.contains(playerPos1)) {          // The while-loop checks if the position is taken by the other player.
                System.out.println("Position taken. Try again: ");
                playerPos1 = sc.nextInt();
            }

            Board.placeSymbol(Board.gameBoard, playerPos1, "player1");
            Board.printBoard();

            String result = Board.checkWinner(player1, player2);

            if (result.length() > 0) {
                System.out.println(result);
                break;

            }

            // *===========================================* Player 2 makes a move.

            System.out.println(player2 + " enter your placement (1-9): ");
            int playerPos2 = sc.nextInt();

            while (playerPosition1.contains(playerPos2) || playerPosition2.contains(playerPos2)) {
                System.out.println("Position taken. Try again: ");
                playerPos2 = sc.nextInt();
            }

            Board.placeSymbol(Board.gameBoard, playerPos2, "player2");
            Board.printBoard();

            if (result.length() > 0) {
                System.out.println(result);
                break;
            }


        }
        Board.clearBoard();

        Scanner playerInput = new Scanner(System.in);

        System.out.println("Do you want to play again? Y/N? ");

        String input = playerInput.nextLine();

        switch (input) {
            case "Y":
            case "y":
                System.out.println("Here we go again!");
                playerMove();
                break;

            case "N":
            case "n":
                System.out.println("Aww, you don't want to play again? ok... thanks for playing though!");
                System.exit(0);
        }


    }

}


