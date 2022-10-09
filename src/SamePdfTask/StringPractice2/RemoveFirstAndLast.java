package SamePdfTask.StringPractice2;
import java.util.Scanner;
public class RemoveFirstAndLast {

    public static void main(String[] args) {


        /*
        [Remove first and last]
         Given two words. Print the first word without its first character then print the second word without its last character.
         Input:
          apple
          banana
           Output:
            pple
            banan
         */
        Scanner input  = new Scanner(System.in);

        System.out.println("Enter your first word");
        String firstWord = input.nextLine();

        System.out.println("Enter your second word");
        String secondWord = input.nextLine();

        System.out.println(firstWord.substring(1,firstWord.length()));
        System.out.println(secondWord.substring(0,secondWord.length()-1));

    }


}
