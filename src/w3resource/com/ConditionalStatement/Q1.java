package w3resource.com.ConditionalStatement;
import java.util.Scanner;
public class Q1 {

    public static void main(String[] args) {

        /*
        Write a Java program to get a number from the user and print whether it is positive or negative. Go to the editor

Test Data
Input number: 35
Expected Output :
Number is positive
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();

        if(num >=0 ){
            System.out.println("number is positive");
        }else {
            System.out.println("number is negative");
        }


    }
}
