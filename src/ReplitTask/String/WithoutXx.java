package ReplitTask.String;
import java.util.Scanner;
public class WithoutXx {

    public static void main(String[] args) {
        /*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.

Example:

input: xHiX

output: Hi

input: apple

output: apple

input: xUxL

output: UxL

input: JavaX

output: Java

         */


        Scanner scan = new Scanner(System.in);
        String word = scan.next();

     if(word.charAt(0) == ('x')  && (word.substring(word.length() - 1).equals("x"))) {
         System.out.println(word.substring(1, word.length() - 1));

     }else if (word.charAt(0) == ('x') || word.charAt(0) == ('X')) {

            System.out.println(word.substring(1,word.length()));



        } else if (word.substring(word.length() - 1).equals("x") || (word.substring(word.length() - 1).equals("X"))) {
            System.out.println(word.substring(0, word.length() - 1));


        } else {
            System.out.println(word);
        }

    }
}



