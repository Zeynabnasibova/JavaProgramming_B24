package codingbat.String1;
import java.util.Scanner;
public class hasBad {
    public static void main(String[] args) {
        /*

Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.


hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
         */

Scanner input = new Scanner(System.in);
String str = input.nextLine();

        if(str.startsWith("bad")){
            System.out.println("true");
        }else if (str.endsWith("bad")){
            System.out.println("true");
        }else if(str.substring(1).startsWith("bad")) {
            System.out.println("true");
        }else if(str.substring(1).startsWith("bad")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
