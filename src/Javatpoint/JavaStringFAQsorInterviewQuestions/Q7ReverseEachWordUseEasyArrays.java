package Javatpoint.JavaStringFAQsorInterviewQuestions;

import java.util.Arrays;

public class Q7ReverseEachWordUseEasyArrays {

    public static void main(String[] args) {

        String sentence = "this is javatpoint";

        String reverse = "";

        for(int i = sentence.length()-1; i >=0;i--){
            reverse += sentence.charAt(i);
        }
        System.out.println(reverse);

        String [] arraysSentence = reverse.split(" ");
        System.out.println(Arrays.toString(arraysSentence));

        String firstWord = arraysSentence[0];
        String secondWord = arraysSentence[1];
        String thirdWord = arraysSentence[2];

        System.out.println(firstWord+ " " + secondWord + " " + thirdWord);

    }
}
