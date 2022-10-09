package Javatpoint.JavaStringFAQsorInterviewQuestions;
import java.util.Locale;
import  java.util.Scanner;
public class cllass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");

        String sentence = input.nextLine();

        String [] arraysSentence = sentence.split(" ");

        String firstWord = arraysSentence[0];
        System.out.println(firstWord);

        String secondWord = arraysSentence[1];
        System.out.println(secondWord);


        String thirdWord = arraysSentence[2];
        System.out.println(thirdWord);

        String newFirstWord = firstWord.substring(0,1).toLowerCase() + firstWord.substring(1).toUpperCase();

        String newSecondWord = secondWord.substring(0,1).toLowerCase() + secondWord.substring(1).toUpperCase();

        String newThirdWord = thirdWord.substring(0,1).toLowerCase() + thirdWord.substring(1).toUpperCase();

        System.out.println(newFirstWord + " " + newSecondWord + " " + newThirdWord);



    }
}
