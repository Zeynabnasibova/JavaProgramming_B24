package w3resource.com.ConditionalStatement;
import java.util.Scanner;
public class Q11 {

    public static void main(String[] args) {

        /*
        Write a program in Java to display n terms of natural numbers and their sum. Go to the editor

Test Data
Input the number: 2
Expected Output :

Input number:
2
The first n natural numbers are :
2
1
2
The Sum of Natural Number upto n terms :
23
         */

Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");

        int num = input.nextInt();

        System.out.println("The first n natural numbers are :\n" + num);

        int sum = 0;

        for(int i = 1; i <= num; i++){

            System.out.println(i);

            sum += i;

        }

        System.out.println("The Sum of Natural Number upto n terms :"+ num + sum);
    }
}
