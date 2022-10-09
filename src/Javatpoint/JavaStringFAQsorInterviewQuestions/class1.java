package Javatpoint.JavaStringFAQsorInterviewQuestions;
import java.util.Scanner;
public class class1 {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.println("Eneter your sentence");

        String sentence = input.nextLine();

        //reverse
        String reverse = "";

        for(int i = sentence.length() -1; i >= 0;i--){

            reverse += sentence.charAt(i);

        }
        System.out.println(reverse);

        String [] arrayReverse = reverse.split(" ");

        String firstWord = arrayReverse[2];

        String secondWord = arrayReverse[1];

        String thirdWord = arrayReverse[0];

        String newFirstWord = firstWord.substring(0,1).toLowerCase() + firstWord.substring(1).toUpperCase();

        String newsecondWord = secondWord.substring(0,1).toLowerCase() + secondWord.substring(1).toUpperCase();

        String newThirdWord = thirdWord.substring(0,1).toLowerCase() + thirdWord.substring(1).toUpperCase();

        System.out.println(newFirstWord + " " + newsecondWord + " "+ newThirdWord);

    }
}
