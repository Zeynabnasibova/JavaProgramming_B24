package codingbat.String1;
import java.util.Scanner;
public class nonStart {
    /*

Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.


nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");
        String a = input.nextLine();
        System.out.println("Enter your second word");
        String b = input.nextLine();
//       String a = "Hello";
//       String b = "There";

       String concat  = a.substring(1)+b.substring(1);
        System.out.println(concat);
    }
}
