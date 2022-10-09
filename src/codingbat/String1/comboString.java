package codingbat.String1;
import java.util.Scanner;
public class comboString {
    public static void main(String [] args){
        /*
        Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).


comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");
        String a = input.nextLine();
        System.out.println("Enter your second word");
        String b = input.nextLine();

        if(a.length()<b.length()){
            System.out.println(a+b+a);
        }else if(b.length()<a.length()){
            System.out.println(b+a+b);
        }else if(a.length()==0){
            System.out.println(b);
        }else if(b.length()==0){
            System.out.println(a);
        }else{
            System.out.println(a+b);
        }

    }
}
