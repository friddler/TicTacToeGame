import java.util.ArrayList;

public class TicTacToe {

    static ArrayList<Integer> playerPosition1 = new ArrayList<>();
    static ArrayList<Integer> playerPosition2 = new ArrayList<>();

    public static void main(String[] args) {


            introMenu();
            while (true) {
                Player.playerMove();
            }



    }




    public static void introMenu(){

        System.out.println("*===================================*");
        System.out.println("Hello & welcome to my TicTacToe-game!");
        System.out.println("How to play: Enter a number (1-9) and it will place an X/O in the square that you'll choose.");
        System.out.println("*==============================*");
        System.out.println("{'1', '|', '2', '|', '3'},\n" +
                "{'4', '|', '5', '|', '6'},\n" +
                "{'7', '|', '8', '|', '9'},");
        System.out.println("*==============================*");
        System.out.println("Player 1 is X, Player 2 is O.");
        System.out.println("Now, enter your names! Good luck! ");
        System.out.println("*===================================*");


    }
}