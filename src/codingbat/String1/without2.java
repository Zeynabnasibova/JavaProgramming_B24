package codingbat.String1;
import java.util.Scanner;
public class without2 {
    public static void main(String[] args) {

        /*
        Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.


without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();


        if(str.equals("")) {
            System.out.println("");
        }else if(str.length()<2){
            System.out.println(str);
    }else if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            System.out.println(str.substring(2));
        } else {
            System.out.println(str);
        }
    }
}