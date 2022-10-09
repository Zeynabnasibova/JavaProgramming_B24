package codingbat.String1;
import java.util.Scanner;
public class firstHalf {

    public static void main(String [] args ){

        /*

Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
         */
Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();
       // String str = "HelloThere";
        str = str.substring(0,str.length()/2);
        System.out.println(str);

    }
}
