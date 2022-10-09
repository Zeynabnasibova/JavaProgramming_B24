package codingbat.String1;
import java.util.Scanner;
public class hasBad1 {

    public static void main(String[] args) {

        /*

Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.


hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String str = scan.next();

        if(str.length() <= 3 && !str.equals("bad")){
            System.out.println(false);
        } else if(str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad")){
            System.out.println("true");
        }
        System.out.println("false");
    }
}


