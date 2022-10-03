import java.util.Scanner;

public class Player {


    public static void playerMove() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player 1 name: ");
        String player1 = sc.nextLine();
        System.out.println("Enter player 2 name: ");
        String player2 = sc.nextLine();

        Board board = new Board();
        board.printBoard();

        // *===========================================* Game begins
        while (true) {
            System.out.println(player1 + " enter your placement (1-9): ");
            int playerPos1 = sc.nextInt();
            while(TicTacToe.playerPosition1.contains(playerPos1) || TicTacToe.playerPosition2.contains(playerPos1)){
                System.out.println("Position taken. Try again: ");
                playerPos1 = sc.nextInt();
            }

            board.placeSymbol(board.gameBoard, playerPos1, "player1");
            board.printBoard();

            String result = Board.checkWinner(player1, player2);

            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            // *===========================================* Player 2 makes a move.

            System.out.println(player2 + " enter your placement (1-9): ");
            int playerPos2 = sc.nextInt();
            while(TicTacToe.playerPosition1.contains(playerPos2) || TicTacToe.playerPosition2.contains(playerPos2)){
                System.out.println("Position taken. Try again: ");
                playerPos2 = sc.nextInt();
            }

            board.placeSymbol(board.gameBoard, playerPos2, "player2");
            board.printBoard();

            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            System.out.println(result);

        }


    }

}



