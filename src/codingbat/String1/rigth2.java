package codingbat.String1;
import java.util.Scanner;
public class rigth2 {
    public static void main(String[] args) {
        /*

Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.


right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();

        if(str.length()>=2){
            System.out.println(str.substring(str.length()-2) + str.substring(0,str.length()-2));
        }else{
            System.out.println(str);
        }


    }
}
