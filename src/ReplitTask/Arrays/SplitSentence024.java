package ReplitTask.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitSentence024 {

    public static void main(String[] args) {

        /*
        Given a String variable sentence, write code to type each word in separate lines.

Example:

sentence -> "Java is fun"

Print

Java
is
fun
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = input.nextLine();

        String [] sentenceArr = sentence.split(" ");

        String newSentenceArr = "";

        for(int i = 0; i < sentenceArr.length;i++){

             newSentenceArr += sentenceArr[i] + " ";

            System.out.println(newSentenceArr);
        }
        System.out.println(newSentenceArr);
    }
}
