package codingbat.String1;
import java.util.Scanner;
public class firstTwo {

    public static void main(String [] args ){

        /*
        Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.


firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();

        if(str.length()==0){
            System.out.println("");
        }else if(str.length()==1){
            System.out.println(str);
            }else if(str.length()>=2){
            System.out.println(str.substring(0,2));
        }else{
            System.out.println(str);
        }
    }
}
