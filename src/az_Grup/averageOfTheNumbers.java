package az_Grup;
import java.util.Scanner;
public class averageOfTheNumbers {
    public static void main(String[] args) {
        /*

Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
         */
Scanner input = new Scanner(System.in);
        System.out.println("Input first number");
        int num1 = input.nextInt();

        System.out.println("Input second number");
        int num2 = input.nextInt();

        System.out.println("Input third number");
        int num3 = input.nextInt();



        // AVERAGE  = SUM OF THE NUMBERS / NUMBER OF NUMBERS

        int average = (num1 + num2 + num3) / 3 ;

        System.out.println("Average of the numbers is: " + average);

    }
}
