package Javatpoint.JavaStringFAQsorInterviewQuestions;
import java.util.Arrays;

import java.util.Scanner;
public class Q4ReverseUseForLoop {

    /*
    4) How to reverse String in java?

    Input:

this is javatpoint
Output:

tnioptavaj si siht
     */

    public static void main(String[] args) {

//                     01234567891011121314151617
        //             this is ja v a t p o i n t
        String name = "this is javatpoint";
        String reverse = "";

        System.out.println("" + name.charAt(name.length()-1) + name.charAt(name.length()-2) + name.charAt(name.length()-3));
        System.out.println();

// name length 18 ,01234567891011121314151617
// for(int i = 18-1;i>=0;i++){
        //i =17,i>=0;i--
        //i =16,i>=0;i--
        //
        //
        //
        for(int i = name.length()-1;i>=0;i--){
            reverse += name.charAt(i);
            System.out.println(reverse);

        }
        System.out.println(reverse);

    }
}
