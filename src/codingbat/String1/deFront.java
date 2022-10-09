package codingbat.String1;
import java.util.Scanner;
public class deFront {

    public static void main(String[] args) {

        /*
        Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
         */
Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();

        if(str.startsWith("a")&& !str.substring(1,2).equals("b")){
            System.out.println(str.substring(0,1) + str.substring(2));
        }else if( str.startsWith("a")  && str.substring(1,2).equals("b") ) {
            System.out.println(str.substring(0));
        }else if(str.substring(1,2).equals("b")){
            System.out.println(str.substring(1));
        }else if(!str.startsWith("a") || !str.startsWith("b")){
            System.out.println(str.substring(2));
        }else{
            System.out.println(str);
        }
    }
}
