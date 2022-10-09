package codingbat.String1;
import java.util.Scanner;
public class conCat {
    public static void main(String[] args) {

        /*
        Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
         */

//        String a = "abc";
//        String b = "cat";

//        String newString = a+b;
//        System.out.println(newString);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a");
        String a = input.nextLine();
        System.out.println("Enter b");
        String b = input.nextLine();

        if(a.endsWith(b.substring(0,1))){
            System.out.println(a + b.substring(1));
        }else if(b.equals("")) {
            System.out.println(a);
        }else if(a.equals("")){
            System.out.println(b);
        }else{
            System.out.println(a+b);
        }
    }
}
