package SamePdfTask.StringPractice2;
import java.util.Scanner;
public class MoveFirstWord {

    public static void main(String[] args) {

        /*

        [Move first word]
        Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        Ex:
        Input: Java is a fun language
        Output: is a fun language Java
        Hint:Use indexOf and substring
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter sentence");
        String sentence = input.nextLine();

       // System.out.println(sentence.indexOf(" "));

        System.out.println(sentence.substring(0,sentence.indexOf(" ")));
        System.out.println(sentence.substring(sentence.indexOf(" "),sentence.length()));

        System.out.println(sentence.substring(sentence.indexOf(" "),sentence.length()) + " " +sentence.substring(0,sentence.indexOf(" ")));




    }
}
