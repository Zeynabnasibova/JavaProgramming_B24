package Javatpoint.JavaStringFAQsorInterviewQuestions;

import java.util.Arrays;

public class Q7ReverseEachWordUseArrays {

    public static void main(String[] args) {

        /*
         Write a java program to reverse each word in string?

Input:

this is javatpoint
Output:

siht si tnioptavaj

         */



//String sentence2 = "this is javatpoint";
//String reverseSentence2 = "";
//for(int i = sentence2.length()-1;i>=0;i--){
//    reverseSentence2 += sentence2.charAt(i);
//}
//        System.out.println(reverseSentence2);
//

        String sentence = "this is javatpoint";

        String reverseFirstWord = "";
        String reverseSecondWord = "";
        String reverseThirdWord = "";



        String [] arraySentence = sentence.split(" ");
        System.out.println(Arrays.toString(arraySentence));

        String firstWord = arraySentence[0];

        String secondWord = arraySentence[1];

        String thirdWord = arraySentence[2];

        for(int i = firstWord.length()-1;i >= 0;i--) {

            reverseFirstWord += firstWord.charAt(i);
        }

            for(int j = secondWord.length()-1;j >=0; j--) {

                reverseSecondWord += secondWord.charAt(j);
            }

                for(int c = thirdWord.length()-1; c >= 0; c--){

                    reverseThirdWord += thirdWord.charAt(c);
                }

        System.out.println(reverseFirstWord + " " + reverseSecondWord + " " +reverseThirdWord);

    }
}
