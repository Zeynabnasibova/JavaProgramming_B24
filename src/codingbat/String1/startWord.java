package codingbat.String1;
import java.util.Scanner;
public class startWord {

    public static void main(String[] args) {

        /*
Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.


startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
         */
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your str");
//        String str = input.nextLine();
//        System.out.println("Enter your word");
//        String word = input.nextLine();
//
        String str = "hippo";
        String word = "hi";

        if(str.length() >= word.length() && str.substring(1,word.length()).equals(word.substring(1))  ){
            System.out.println(str.substring(0,word.length()));
        }else{
            System.out.println("");
        }


    }
}
