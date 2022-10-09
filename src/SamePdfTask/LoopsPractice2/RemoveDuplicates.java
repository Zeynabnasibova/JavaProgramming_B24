package SamePdfTask.LoopsPractice2;
import java.util.Scanner;
public class RemoveDuplicates {

    public static void main(String[] args) {

        /*
        Remove Duplicates
Write a program that can remove duplicates from a String Ex:
Input: abcabc Output: abc
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();

        String unique = "";

        for(int i = 0; i < word.length(); i++){
           if(!unique.contains(""+ word.charAt(i))){
               unique= unique + word.charAt(i);

           }

     }

        System.out.println(unique);
    }
}
