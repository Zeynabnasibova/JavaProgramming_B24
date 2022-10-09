package ReplitTask.String;
import java.util.Scanner;
public class Merge_Them {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        You have 2 words, both of them have 3 characters.

If either of them does not have exactly 3 characters, print "cannot merge"

Merge their characters one by one and print together like below:
         */
        System.out.println("Enter first word");
        String word1 = input.nextLine();
        System.out.println("Enter second word");
        String word2 = input.nextLine();

        if(word1.length() != 3 || word2.length() != 3){
            System.out.println("Cannot merge");
        }else{
            System.out.println(word1.charAt(0) + "" + word2.charAt(0)+ "" + word1.charAt(1) + "" + word2.charAt(1) + "" + word1.charAt(2)+ "" + word2.charAt(2));
        }


    }
}
