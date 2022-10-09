package codingbat.String1;
import java.util.Scanner;
public class atFirst {

    public static void main(String[] args) {

        /*
        Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.


atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();

        if(str.length()>=2){
            System.out.println(str.substring(0,3));
        }else if(str.length()<2){
            System.out.println(str.charAt(0) + "@");
        }else{
            System.out.println(str);
        }

    }
}
