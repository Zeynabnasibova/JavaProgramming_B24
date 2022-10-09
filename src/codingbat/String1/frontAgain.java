package codingbat.String1;
import java.util.Scanner;
public class frontAgain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        /*

Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".


frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
         */
//
//        String str = "edited";
//        String newStr = str.substring(str.length()-2);
//        System.out.println(newStr);

        if(str.equals("") || str.length() <2){
            System.out.println("false");
    } else if(str.substring(0,2).equals(str.substring(str.length()-2))){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
