package codingbat.String1WithReturn;

import java.util.Scanner;

public class nonStartReturn {
/*

Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.


nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
 */
    public static String nonStart(String a, String b) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");
        a = input.nextLine();
        System.out.println("Enter your second word");
        b = input.nextLine();

        String concat  = a.substring(1)+b.substring(1);

        System.out.println(concat);

        return concat;
    }

    public static void main(String[] args) {


       // System.out.println(nonStart("hello","there"));

       // nonStart("hello","there");
    }
}
