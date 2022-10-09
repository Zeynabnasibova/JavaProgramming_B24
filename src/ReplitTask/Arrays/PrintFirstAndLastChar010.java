package ReplitTask.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class PrintFirstAndLastChar010 {

    public static void main(String[] args) {

        /*
        Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
Example:
words → ["hello", "why", "by", "apple" , "note"]

print:
ho
wy
by
ae
ne
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below
        //System.out.println(Arrays.toString(words).split(","));

        for(int i = 0; i < words.length; i++){

        String newWords = words[i].substring(0,1) + words[i].substring(words[i].length()-1);

            System.out.println(newWords);
        }
    }
}
