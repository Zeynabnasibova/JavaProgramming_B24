package Javatpoint.JavaStringFAQsorInterviewQuestions;

import java.util.Locale;
import java.util.Scanner;

public class Q7ReverseEachWordUseForLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String sentence = "this is javatpoint";


        String firstWord = sentence.substring(0, sentence.indexOf(" "));

        String secondWord = sentence.substring(sentence.indexOf(" ") + 1, sentence.lastIndexOf(" "));

        String thirdWord = sentence.substring(sentence.lastIndexOf(" ") + 1);

        String reverseFirstWord = "";
        String reverseSecondWord = "";
        String reverseThirdWord = "";

        for (int i = firstWord.length() - 1; i >= 0; i--) {
            reverseFirstWord += firstWord.charAt(i);
        }
        for (int j = secondWord.length() - 1; j >= 0; j--) {
            reverseSecondWord += secondWord.charAt(j);
        }
        for (int c = thirdWord.length() - 1; c >= 0; c--) {
            reverseThirdWord += thirdWord.charAt(c);
        }

        System.out.println(reverseFirstWord + " " + reverseSecondWord + " " + reverseThirdWord);
    }

}
