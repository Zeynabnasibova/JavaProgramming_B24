package day23_loops;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secretNumber = 80;
        int userGuess;

        do {

            System.out.println("Guess a number");
            userGuess = input.nextInt();



            if(userGuess == secretNumber){
                System.out.println("Good guess! The number was " + secretNumber);
            }else if(userGuess < secretNumber){
                System.out.println(userGuess + " is too small");
            }else if(userGuess > secretNumber){
                System.out.println(userGuess + " is too big");
            }
        }while(userGuess != secretNumber);



    }
}
