package ReplitTask.Loops;
import java.util.Scanner;
public class PrintLettersCombinations {

    public static void main(String[] args) {
/*
Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'. The combinations should be displayed in descending alphabetical order:

zz

zy

zx

zw

zv

yz

....

vv
 */
        Scanner input = new Scanner(System.in);

        char letterFirst = 'z';
        char letterTwo = 'y';
        char letterThree = 'x';
        char letterFour = 'w';
        char letterLast = 'v';
        int changeLetterStart = letterFirst;
        int count = 0;


        while (letterFirst != (char)(letterLast-1)) {

            while (count <= (changeLetterStart - letterLast)) {

                System.out.println("" + letterFirst + (char)(changeLetterStart - count++));
            }
            letterFirst = (char)(letterFirst - 1);
            count = 0;

        }











    }
}
