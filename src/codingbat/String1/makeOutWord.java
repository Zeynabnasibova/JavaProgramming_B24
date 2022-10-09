package codingbat.String1;
import java.util.Scanner;
public class makeOutWord {

    public static void main(String [] args){

        /*

Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.


makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]

         */
Scanner input = new Scanner(System.in);
        System.out.println("Enter your out");
String out = input.nextLine();
        System.out.println("Enter your word");
        String word = input.nextLine();
// String out = <<>>;
// String word = Yay;
// String newWord = <<Yay>>;

        word = out.substring(0,2) + word + out.substring(2,4);

        System.out.println(word);


    }
}
