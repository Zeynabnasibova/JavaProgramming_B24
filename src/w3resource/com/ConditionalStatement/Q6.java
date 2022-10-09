package w3resource.com.ConditionalStatement;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {

        /*
        Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.

Test Data
Input floating-point number: 25.586
Input floating-point another number: 25.589
Expected Output :
They are different
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first floating-point numbers");

        float num1 = input.nextFloat();

        System.out.println("Enter your second floating-point numbers");

        float num2 = input.nextFloat();

        if(num1 == num2){

            System.out.println("Same number");
        }else{
            System.out.println("different");
        }
    }
}
