package w3resource.com.ConditionalStatement;
import java.util.Scanner;
public class Q4 {

    public static void main(String[] args) {

        /*
        Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

Test Data
Input a number: 25
Expected Output :
Input value: 25
Positive number
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your floating-point number");
        float num = input.nextFloat();

        if(num==0){
            System.out.println("zero");
        }else if (num > 0){
            System.out.println("positive number");
        }else if(num < 0){
            System.out.println("negtive number");
        }if(num < 1){
            System.out.println("small");
        }else if(num > 1_000_000){
            System.out.println("large");
        }
    }

    }


