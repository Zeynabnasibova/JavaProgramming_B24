package w3resource.com.Method;

import java.util.Scanner;

public class Q1a {

        public static int number(int num1, int num2, int num3){

        /*
        Write a Java method to find the min number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The min value is 25.0
         */

            Scanner input = new Scanner(System.in);

            System.out.println("Enter your first number");
            num1 = input.nextInt();
            System.out.println("Enter your second number");
            num2 = input.nextInt();
            System.out.println("Enter your third number");
            num3 = input.nextInt();
//      num1 = 3;
//      num2 = 6;
//      num3 = 9;

            int max = Integer.MIN_VALUE;

            int min = Integer.MAX_VALUE;

           // int min ;

            if(num1 < num2 && num1 < num3){
                min = num1;
            }else if(num2 < num1 && num2 < num3){
                min = num2;
            }else {
                min = num3;
            }

            System.out.println(min + " is the min.");
            return min;

        }

        public static void main(String[] args) {
            number(3,6,9);
        }

    }
