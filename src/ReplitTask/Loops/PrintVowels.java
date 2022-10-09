package ReplitTask.Loops;
import java.util.Scanner;
public class PrintVowels {

    public static void main(String[] args) {

        /*
        Create a program that will take the given String In and print out all the vowels from the String.

Example:

Input: howdyho

Output: oo

Input: huehuehuehue

Output: ueueueue
         */
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below

        String vowels = "aeoiu";
        int countvVowels = 0;
        String showVowels = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) =='a' || word.charAt(i) == 'e' || word.charAt(i)=='o' || word.charAt(i)=='i' || word.charAt(i) == 'u') {
                countvVowels++;
                showVowels += word.charAt(i);

            }

        }
        System.out.println(countvVowels);
        System.out.println(showVowels);
    }
}

