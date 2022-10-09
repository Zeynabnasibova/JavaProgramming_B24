package w3resource.com.ConditionalStatement;
import java.util.Scanner;
import java.util.Arrays;
public class Q12 {

    public static void main(String[] args) {

        /*
        Write a program in Java to input 5 numbers from keyboard and find their sum and average. Go to the editor

Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :

Input the 5 numbers :
1
2
3
4
5
The sum of 5 no is : 15
The Average is : 3.0
         */
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your length size");

        int lenthSize = input.nextInt();

        int [] num = new int [lenthSize];

        for(int i = 0; i < lenthSize; i++){

            System.out.println("Enter your numbere: " + (i + 1));

            num [i] = input.nextInt();
        }
        System.out.println(Arrays.toString(num));

        // int [] num = {4, 6, 2, 10};

        double sum = 0;
        double average = 0;

        for(int i = 0; i < num.length; i++){

            sum += num[i];

             average = sum / num.length;
        }

        System.out.println("average: " + average);






    }
}
