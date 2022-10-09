package codingbat.String1;
import java.util.Scanner;
public class withoutX2 {

    public static void main(String[] args) {

        /*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();

    if (str.startsWith("x") || str.length()<=1) {
        System.out.println("");
    }else  if (str.startsWith("x") && str.substring(1,2).equals("x")) {
            System.out.println(str.replace("x","") );
        }else if(str.startsWith("x") && str.length()>1) {
            System.out.println(str.substring(1));

        }else if(str.substring(1,2).equals("x") && !str.startsWith("x")) {
            System.out.println(str.substring(0, 1) + str.substring(2));

        }else{
            System.out.println(str);
        }


    }
}
