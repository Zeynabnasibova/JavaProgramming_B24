package ReplitTask.String;
import java.util.Scanner;
public class Verify_Contains2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Write a program that will verify if word contains in the sentence.Print out the result as boolean value.
         */


        System.out.println("Input word");
        String word = input.nextLine();

        System.out.println("Input sentence");
        String sentence = input.nextLine();

        System.out.println(sentence.contains(word));

    }
}
