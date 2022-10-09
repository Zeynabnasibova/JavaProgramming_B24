package Interwiequestion;

import java.util.Arrays;

public class Q3 {

    public static void main(String[] args) {
        //reverse number 1234
        // 4321

//        String str = "name";
//
//        String reverse = "";
//
//        for(int i = str.length()-1 ; i >= 0; i-- ){
//            reverse +=  str.charAt(i);
//        }
//
//        System.out.println(reverse);


        String str = "I love java";

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse += str.charAt(i);

        }
        System.out.println(reverse);

        String [] arraysSentence = reverse.split(" ");

        System.out.println(Arrays.toString(arraysSentence));

//        String firstWord = arraysSentence[2];
//        String secondWord = arraysSentence[1];
//        String thirdWord = arraysSentence[0];
//
//        System.out.println(firstWord + secondWord + thirdWord);

        String newReversed = "";

        for(int i = arraysSentence.length-1; i >= 0; i--){

            newReversed += arraysSentence[i] + " ";

        }
        System.out.println(newReversed);

    }
}