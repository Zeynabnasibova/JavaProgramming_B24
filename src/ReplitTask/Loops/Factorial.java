package ReplitTask.Loops;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        /*
        In mathematics a factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n. Calculate factorial and output result to the console.

Example:

input: 5
output: 120

5 * 4 * 3 * 2 * 1
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long FactorialNum = 1;

        while (n > 0) {
            FactorialNum *= n;
            n--;
        }
        System.out.println(FactorialNum);
    }
}
