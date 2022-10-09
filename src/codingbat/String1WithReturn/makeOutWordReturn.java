package codingbat.String1WithReturn;
import java.util.Scanner;
public class makeOutWordReturn {
/*

Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.


makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
 */
    public static String makeOutWord(String out, String word) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your out");
        out = input.nextLine();
        System.out.println("Enter your word");
        word = input.nextLine();

        word = out.substring(0,2) + word + out.substring(2,4);

        System.out.println(word);

        return word;
    }

    public static void main(String[] args) {

        //System.out.println(makeOutWord("<<>>","Yay"));

        makeOutWord("<<>>","Yay");
    }
}
