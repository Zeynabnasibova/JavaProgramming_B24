package SamePdfTask.StringPractice2;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Scanner;
public class MidleChar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*

        [Middle char]
        Given a String, write a program to display the middle character of a string
        a) If the length of the string is even there will be two middle characters. b) If the length of the string is odd there will be one middle character.
         Ex:
        Input:
        elephant
        Output: The middle characters: ph
         */

        System.out.println("Enter your word");
        String word = input.nextLine();



        if(word.length()%2 == 0){
            System.out.println("The middle characters: " + word.charAt(word.length()/2-1) + word.charAt(word.length()/2));

        }if(word.length()%2 != 0){
            System.out.println("The middle characters: " + word.charAt(word.length()/2));
        }

    }
}
