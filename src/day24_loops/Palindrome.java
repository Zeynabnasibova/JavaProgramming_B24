package day24_loops;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
/*
            ReplitTask.String from user
            reverse the ReplitTask.String
            i can use a loop to get indexes backwards
            i use those reverse index with charAt
                -> read chars backwards
                concat to another ReplitTask.String
                5 > 4 > 3 >  etc  0
            reverse ReplitTask.String is equal to my original ReplitTask.String
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();
        String reverse = "";

        for(int index = word.length() - 1; index >= 0; index--){
            reverse += word.charAt(index);
            //  System.out.println(word.charAt(index));
        }

        System.out.println(reverse);

        if (word.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


    }
}
