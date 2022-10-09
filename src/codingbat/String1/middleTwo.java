package codingbat.String1;
import java.util.Scanner;
public class middleTwo {

    public static void main(String[] args) {

        /*
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.


middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Eneter your word");
        String str = input.nextLine();

        if(str.length()%2==0 && str.length()>=2){
         String middleStr = str.substring(str.length()/2-1,str.length()/2+1);
            System.out.println(middleStr);
        }else{
            System.out.println(str);
        }


    }
}
