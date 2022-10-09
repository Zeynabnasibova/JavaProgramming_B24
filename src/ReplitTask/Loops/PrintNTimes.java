package ReplitTask.Loops;
import java.util.Scanner;
public class PrintNTimes {

    public static void main(String[] args) {

        /*
        Given an int variable n print out n asterisks. So if n=5, five asterisks will be printed.

Example:

input: 1

output: *

Example:

input: 3

output: ***
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int countAsterisks = 0;
        String asterisks = "";



        for(int i = 0; i < n; i++){
            countAsterisks++;
            asterisks += "*";

        }
        System.out.println(asterisks);
    }
}
