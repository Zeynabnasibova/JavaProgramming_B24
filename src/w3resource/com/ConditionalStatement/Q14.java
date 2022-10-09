package w3resource.com.ConditionalStatement;


import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {

        /*

Write a program in Java to display the multiplication table of a given integer. Go to the editor

Test Data
Input the number (Table to be calculated) : Input number of terms : 5
Expected Output :
5 X 0 = 0
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");

        int num = input.nextInt();

        String str = "";

        for(int i = 0; i <= num; i ++){

         str = num + " * " + (i) + " = " + (i * num);

            System.out.println(str);

        }


    }
}
