package Javatpoint.JavaStringFAQsorInterviewQuestions;

import java.util.Arrays;
import java.util.Locale;

public class Q6Capitalize {

    public static void main(String[] args) {

        /*
        6) Write a java program to capitalize each word in string?

Input:

this is javatpoint
Output:

This Is Javatpoint

         */

        String sentense = "this is javatpoint";

        String [] arraySentence = sentense.split(" ");

        String capitalizeWord = "";

        //        System.out.println(Arrays.toString(arraySentence));
        for(String eachWord : arraySentence) {

//            System.out.println(eachWord);

            String firstWord = arraySentence[0].substring(0,1).toUpperCase() + arraySentence[0].substring(1);
            String secondWord = arraySentence[1].substring(0,1).toUpperCase() + arraySentence[1].substring(1);
            String thirdWord = arraySentence[2].substring(0,1).toUpperCase() + arraySentence[2].substring(1);

       capitalizeWord = firstWord + " " + secondWord + " " + thirdWord;


        }

        System.out.println(capitalizeWord);

//        String firstWord1 = arraySentence[0];
//        System.out.println(firstWord1);
//
//        String secondWord2 = arraySentence[1];
//        System.out.println(secondWord2);
//
//        String thirdWord3 = arraySentence[2];
//        System.out.println(thirdWord3);




//
//            String newFirstWord1 = firstWord1.substring(0,1).toUpperCase() + firstWord1.substring(1);
//            String newSecondWord2 = secondWord2.substring(0,1).toUpperCase() +secondWord2.substring(1);
//            String newThirdWord3 = thirdWord3.substring(0,1).toUpperCase()+ thirdWord3.substring(1);
//
//            capitalizeWord = newFirstWord1+ " " + newSecondWord2 + " " + newThirdWord3;

//            System.out.println(eachWord);
//
//        }
//        System.out.println(capitalizeWord);


//        String firstWord = arraySentence [0].substring(0,1).toUpperCase()+arraySentence[0].substring(1,arraySentence[0].length());
//        System.out.println(firstWord);
//        String secondWord = arraySentence[1].substring(0,1).toUpperCase() + arraySentence[1].substring(1,arraySentence[1].length());
//        System.out.println(secondWord);
//        String thirdWord = arraySentence[2].substring(0,1).toUpperCase() +
//                arraySentence[2].substring(1,arraySentence[2].length());
//        System.out.println(thirdWord);
//
//        System.out.println(firstWord+ " " + secondWord + " " +thirdWord);



    }
}
