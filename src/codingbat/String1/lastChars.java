package codingbat.String1;
import java.util.Scanner;
public class lastChars {
    public static void main(String[] args) {


/*
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.


lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
 */
//
//a = "yo";b = "java" --> "ya"


        String a = "";
        String b = "Hello";


//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your first word");
//        String a = input.nextLine();
//
//        System.out.println("Enter your second word");
//        String b = input.nextLine();
       // String newString = a.substring(0, 1) + b.substring(b.length() - 1);

        if (a.length() < 1 && b.length() < 1) {
            System.out.println("@@");
        } else if (a.length() < 1 && b.length() > 0) {
            System.out.println("@" + b.substring(b.length() - 1));
        }else if(a.length() >0 && b.length()<1){
            System.out.println(a.substring(0, 1) + "@");
        } else {
            System.out.println(a.substring(0, 1) + b.substring(b.length() - 1));

        }
    }
}