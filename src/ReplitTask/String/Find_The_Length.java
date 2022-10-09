package ReplitTask.String;
import java.util.Scanner;
public class Find_The_Length {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Write a program that will output length of the text (string).

         */

        System.out.println("Please enter the text");

        String text = input.nextLine();
//        int charCount = text.length();
//        System.out.println("Length is: " + charCount);

     // System.out.println("Length is: " + input.nextLine().length());
        System.out.println("Length is: " + text.length());

    }

}