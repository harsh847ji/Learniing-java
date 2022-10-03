import java.util.Random;
import java.util.Scanner;

class Game{
    int userInput;
    public int comp;

//    public int getComp() {
//        return comp;
//    }

    // Constructor for generating Random no
    public Game(){
        Random random = new Random();
        comp= random.nextInt(101);
    }
    public void takeUserInput(){
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();

    }
    public boolean isCorrect(){
        if (userInput == comp){
            return true;
        }
        else {
            return false;
        }
    }
    public void play(){
        int chance = 0;
        Game game = new Game();
        do {
            chance++;
            System.out.println();
            System.out.println("Guess the no ");

            game.takeUserInput();
            if (game.isCorrect()){
                System.out.println("YOU WIN!");
//                System.out.println("Computer chooses "+game.comp);
                break;
            }
            else {
                System.out.println("YOU LOOSE!");
//                System.out.println("Computer chooses "+game.comp);
                if ( game.comp> game.userInput){
                    System.out.println("GUESS LARGER NO");
                }
                if (game.comp< game.userInput){
                    System.out.println("GUESS SMALLER NO");
                }
                System.out.println("Chance no:- "+chance);
            }

        }
        while (game.comp != game.userInput);
        System.out.println("YOU TAKE "+chance+" CHANCES");
    }
}



public class NoGuessingGame {
    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}
