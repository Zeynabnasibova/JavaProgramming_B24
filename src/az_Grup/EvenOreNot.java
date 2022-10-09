package az_Grup;
import java.util.Scanner;
public class EvenOreNot {
    public static void main(String[] args) {

        /*
        Write a Java program to accept a number and check the number is even or not.
Sample Output:

Input a number: 20

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Input number");
        int num = input.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + " is even number");
        } else if(num % 2 != 0) {
            System.out.println(num + " is odd number");

        }
    }
}

