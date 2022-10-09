package Javatpoint.JavaStringFAQsorInterviewQuestions;

import java.util.Locale;

public class Q9LoverUpperReversedWord {

    public static void main(String [] args){

        /*
        Write a java program to tOGGLE each word in string?

Input:

this is javatpoint
Output:

tHIS iS jAVATPOINT
         */

        String sentence = "this is javatpoint";

        String reverse = "";

        for(int i = sentence.length()-1; i >=0; i--){
            reverse += sentence.charAt(i);
        }
        System.out.println(reverse);

        String firstReversetWord = reverse.substring(reverse.lastIndexOf(" ")+1);

        String secondReversedWord = reverse.substring(reverse.indexOf(" ") + 1,reverse.lastIndexOf(" "));

        String thirdReversedWord = reverse.substring(0,reverse.indexOf(" "));

        System.out.println(firstReversetWord + " " + secondReversedWord + " " + thirdReversedWord);

        String newfirstReversetWord = firstReversetWord.substring(0,1).toLowerCase() + firstReversetWord.substring(1).toUpperCase();

        String newsecondReversedWord = secondReversedWord.substring(0,1).toLowerCase() + secondReversedWord.substring(1).toUpperCase();

        String newthirdReversedWord = thirdReversedWord.substring(0,1).toLowerCase() + thirdReversedWord.substring(1).toUpperCase();


        System.out.println(newfirstReversetWord + " " +newsecondReversedWord + " " + newthirdReversedWord);

    }
}
