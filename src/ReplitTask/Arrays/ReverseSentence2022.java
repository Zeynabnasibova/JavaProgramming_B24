package ReplitTask.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence2022 {

    public static void main(String[] args) {

        /*
        Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:

sentence -> Java is fun

reversed > fun is Java
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = input.nextLine();

        String [] str = sentence.split(" ");

        String reverse = "";

        for(int i = str.length-1;i >= 0; i--){

            reverse += str[i] + " ";

        }
        System.out.println(reverse);


        String [] strArr =  reverse.split(" ");

        System.out.println(Arrays.toString(strArr));
    }
}
