package az_Grup;
import java.util.Scanner;
public class compareTwoNumbers {
    public static void main(String[] args) {
        /*

        Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
num1 > num2
num1 != num2
num1 < num2
num1 <= num2
true  == true
true != true

         */


        System.out.println("Input first integer: ");
        int num1 = 25;

        System.out.println("Input second number: ");
        int num2 = 39;

        System.out.println(num1 > num2); //false

        System.out.println(num1 != num2); // true

        System.out.println(num1 < num2); // true

        System.out.println(num1 <= num2); // true

        boolean num3 = true;
        boolean num4 = true;
        boolean test = num3 != num4; //false
        boolean test2 = num3 == num4; // true
        boolean test3 = num1 > num2 ;// false


        System.out.println(test);
        System.out.println(test2);
        System.out.println(test3);

    }
}
