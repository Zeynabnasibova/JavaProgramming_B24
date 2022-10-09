package ReplitTask.Loops;
import java.util.Scanner;

public class PrintLetters {

    public static void main(String[] args) {
        /*
        Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.

Example:

input:
A
Z

output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

Example:

input:
a
f

output: abcdef

Example:

input:
a
d

output: abcd
copied!
Example:

input:
B
O

output: BCDEFGHIJKLMNO
         */
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);


         int counter = 0;
        String countLetter = " ";


            for(;start<=end;start++){
                counter++;
                countLetter += start + " ";


        }


        System.out.println(countLetter);
        System.out.println(counter);

    }
}
