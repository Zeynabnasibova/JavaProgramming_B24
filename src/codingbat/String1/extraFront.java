package codingbat.String1;
import java.util.Scanner;
public class extraFront {

    public static void main(String[] args) {

        /*
        Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.


extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
         */
Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
String str = input.nextLine();
     //   String str = "Hello";


        if (str.length() > 1) {
            System.out.println(str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2));

        }else{
            System.out.println(str + str + str);

        }
    }
}
