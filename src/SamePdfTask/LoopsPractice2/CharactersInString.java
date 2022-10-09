package SamePdfTask.LoopsPractice2;
import java.util.Scanner;
public class CharactersInString {

    public static void main(String[] args) {

        /*
Characters in String
Given a String print the ascii value codes for each character
Ex:
Input:
“java” Output:
106 97 118 97

         */
Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String name = input.nextLine();

        for(int i = 0; i < name.length(); i++){
            System.out.print((int)name.charAt(i) +" ");
        }


    }
}
