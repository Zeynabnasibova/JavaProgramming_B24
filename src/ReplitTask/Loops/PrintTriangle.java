package ReplitTask.Loops;
import java.util.Scanner;
public class PrintTriangle {

    public static void main(String[] args) {

        /*
        Write a program that will create a triangle of asterisks based on size n.

Example:

input: 5

output:
*
**
***
****
*****

Example:

input: 3

output:
*
**
***
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String asteriks = "";
        for(int i = 0; i <= n; i++){
            asteriks +=  "*";
            System.out.println(asteriks);
        }

    }
}
