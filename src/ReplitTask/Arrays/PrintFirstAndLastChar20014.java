package ReplitTask.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLastChar20014 {

    /*
    Given a String array words, iterate through each word and print first and last letter of each element in the format below. Put each first and last letter in an array.

Example:

words → ["hello", "why", "by", "apple" , "note"]

print → [ho, wy, by
     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

       // System.out.println(Arrays.toString(words));
        //TODO: Write your code below

       for(int i = 0; i < words.length; i++){

   words[i]  = words[i].substring(0,1) + words[i].substring(words[i].length()-1);

}
        System.out.println(Arrays.toString(words));


    }

}
