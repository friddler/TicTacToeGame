public class Board {

    // A 2D-array, which will be our board/grid for our tictactoe-game.

    char[][] gameBoard = {

            {'_', '|', '_', '|', '_'},
            {'_', '|', '_', '|', '_'},
            {' ', '|', ' ', '|', ' '},

    };

    // To print out our gameboard we need to make a method for it. Our method will repeat our array for each row.

    public void printBoard(){
        for(char[] row : gameBoard){
            for(char c : row){
                System.out.print(c); // We'll use the print-mehod because we want our array to be printed on the same line.
            }
            System.out.println();
        }
    }

    //




}
