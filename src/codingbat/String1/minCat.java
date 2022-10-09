package codingbat.String1;
import java.util.Scanner;
public class minCat {
    public static void main(String[] args) {
        /*
        Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");
        String a = input.nextLine();
        System.out.println("Enter your second word");
        String b = input.nextLine();

        if(a.length()>b.length()){
            System.out.println(a.substring(a.length()-b.length()) + b);
        }else if(b.length()>a.length()){
            System.out.println(a + b.substring(b.length()-a.length()));
        }else{
            System.out.println(a+b);
        }
    }
}
