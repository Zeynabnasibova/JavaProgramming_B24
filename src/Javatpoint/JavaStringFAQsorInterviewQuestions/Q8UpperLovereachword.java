package Javatpoint.JavaStringFAQsorInterviewQuestions;
import java.util.Scanner;
public class Q8UpperLovereachword {

    public static void main(String [] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = input.nextLine();

        String [] arraySentence = sentence.split(" ");
        String firstWord = arraySentence[0];
        String secondWord = arraySentence[1];
        String thirdWord = arraySentence[2];

        String newFirstWord = firstWord.substring(0,1).toLowerCase() +  firstWord.substring(1).toUpperCase();
        String newSecondWord = secondWord.substring(0,1).toLowerCase() + secondWord.substring(1).toUpperCase();
        String newThirdWord = thirdWord.substring(0,1).toLowerCase() + thirdWord.substring(1).toUpperCase();

        System.out.println(newFirstWord + " " + newSecondWord + " " + newThirdWord);


    }
}
