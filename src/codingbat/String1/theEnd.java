package codingbat.String1;
import day22_loops.HelloProgram;

import java.util.Scanner;
public class theEnd {
    public static void main(String[] args) {

        /*
        Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
         */
//        String str = "Hello";
        boolean front =true;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine().toLowerCase();
        System.out.println ("Enter your letter");
        String n = input.nextLine().toLowerCase();

        //String strfirstLetter = str.substring(0,1);
        String strLastLetter = str.substring(str.length()-1);
        System.out.println(strLastLetter);



        if(str.startsWith(n)){
            System.out.println(front);
        }else{
            System.out.println(!front);

        }

    }
}
