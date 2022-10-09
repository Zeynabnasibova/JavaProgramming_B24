package SamePdfTask.LoopsPractice2;
import java.util.Locale;
import  java.util.Scanner;
public class CountWords {

    public static void main(String[] args) {

        /*
  Characters in String
Given a String print the ascii value codes for each character
Ex:
Input:
“java” Output:
106 97 118 97
4
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine().trim();

        for(int i = 0; i < word.length(); i++) {

            System.out.println(word.charAt(i));

        }

    }
}
