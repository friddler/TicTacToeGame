import java.util.ArrayList;

public class TicTacToe {

    static ArrayList<Integer> playerPosition1 = new ArrayList<>();
    static ArrayList<Integer> playerPosition2 = new ArrayList<>();

    public static void main(String[] args) {


            introMenu();
            Player.playerMove();


    }

    public static void introMenu(){

        System.out.println("*===================================*");
        System.out.println("Hello & welcome to my TicTacToe-game!");
        System.out.println("How to play: Enter a number (1-9) and it will place an X/O in the square that you'll choose. But first enter your names! ");
        System.out.println("*===================================*");


    }
}