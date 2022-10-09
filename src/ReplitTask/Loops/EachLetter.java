package ReplitTask.Loops;
import java.util.Scanner;
public class EachLetter {

    public static void main(String[] args) {

        /*
        Given a String, use a loop to print every character from the String on a new line.

Examples:

Input: hello
h
e
l
l
o

Input: zimbabwe
z
i
m
b
a
b
w
e
copied!
Input: wow!
w
o
w
!
         */

        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();

        for(int i = 0;i < word.length();i++){
         // System.out.println(word.substring(i));
            System.out.println(word.charAt(i));
        }

    }
}
