import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {

    public static char[][] gameBoard = fillGameBoard();

    // A 2D-array, which will be our board/grid for our tictactoe-game.

    public static char[][] fillGameBoard() {
        return new char[][]{
                {'_', '|', '_', '|', '_'},
                {'_', '|', '_', '|', '_'},
                {' ', '|', ' ', '|', ' '},

        };
    }

    // To print out our gameboard we need to make a method for it. Our method will repeat our array for each row.

    public static void printBoard() {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c); // We'll use the print-mehod because we want our array to be printed on the same line.
            }
            System.out.println();
        }
    }

    public static void placeSymbol(char[][] gameBoard, int pos, String player) {

        char symbol = ' ';

        if (player.equals("player1")) {
            symbol = 'X';
            TicTacToe.playerPosition1.add(pos);
        } else if (player.equals("player2")) {
            symbol = 'O';
            TicTacToe.playerPosition2.add(pos);
        }

        switch (pos) {
            case 1 -> gameBoard[0][0] = symbol;
            case 2 -> gameBoard[0][2] = symbol;
            case 3 -> gameBoard[0][4] = symbol;
            case 4 -> gameBoard[1][0] = symbol;
            case 5 -> gameBoard[1][2] = symbol;
            case 6 -> gameBoard[1][4] = symbol;
            case 7 -> gameBoard[2][0] = symbol;
            case 8 -> gameBoard[2][2] = symbol;
            case 9 -> gameBoard[2][4] = symbol;
        }
    }


    public static String checkWinner(String player1, String player2) {    // To get the names from the players I will put in their names in the checkwinner method.

        List<Integer> topRow = Arrays.asList(1, 2, 3);
        List<Integer> midRow = Arrays.asList(4, 5, 6);
        List<Integer> botRow = Arrays.asList(7, 8, 9);
        List<Integer> leftCol = Arrays.asList(1, 4, 7);
        List<Integer> midCol = Arrays.asList(2, 5, 8);
        List<Integer> rightCol = Arrays.asList(3, 6, 9);
        List<Integer> cross1 = Arrays.asList(1, 5, 9);
        List<Integer> cross2 = Arrays.asList(3, 5, 7);

        ArrayList<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (List l : winning) {
            if (TicTacToe.playerPosition1.containsAll(l)) {
                return "Congratulations " + player1 + " you won! ";
            } else if (TicTacToe.playerPosition2.containsAll(l)) {
                return "Congratulations " + player2 + " you won! ";
            }
        }
        if (TicTacToe.playerPosition1.size() + TicTacToe.playerPosition2.size() == 9) {
            return "It's a draw!";
        }
        return "";
    }
    public static void clearBoard(){
        TicTacToe.playerPosition1.clear();
        TicTacToe.playerPosition2.clear();
        gameBoard = fillGameBoard();
    }

}











