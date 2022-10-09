package codingbat.String1WithReturn;
import java.util.Scanner;
public class firstHalfReturn {
    /*
    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
     */

    public static String firstHalf(String str) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        str = input.nextLine();

        str = str.substring(0,str.length()/2);

        System.out.println(str);

        return str;
    }

    public static void main(String[] args) {



        //System.out.println(firstHalf("WooHoo"));

        firstHalf("WooHoo");
    }

}
