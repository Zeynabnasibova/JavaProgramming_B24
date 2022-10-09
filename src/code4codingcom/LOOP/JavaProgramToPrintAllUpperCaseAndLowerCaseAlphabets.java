package code4codingcom.LOOP;
import java.util.Scanner;
public class JavaProgramToPrintAllUpperCaseAndLowerCaseAlphabets {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("Enter letter");
        char ch = input.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            for (ch = 'A'; ch <= 'Z'; ch++) {
                System.out.println(ch);
            }
            }else if(ch>='a' && ch<='z'){
            for(ch = 'a';ch <='z';ch++){
                System.out.println(ch);
            }
        }
    }
}
