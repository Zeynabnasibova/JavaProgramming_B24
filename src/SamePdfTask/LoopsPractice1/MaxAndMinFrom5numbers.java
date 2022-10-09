package SamePdfTask.LoopsPractice1;
import java.util.Scanner;
public class MaxAndMinFrom5numbers {

    public static void main(String[] args) {

        /*
        [Max and Min from 5 numbers]
• Write a program that can ask the user "enter a number" five times and return the maximum number
• Write a program that can ask the user "enter a number" five times and return the minimum number
         */
        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE,
                min = Integer.MAX_VALUE;
        for(int i = 1; i <=5;i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();
            if (num > max) {
                max = num;

            }if (num < min) {
                min = num;

            }
        }
        System.out.println("minumun number: " + min);
        System.out.println("maximum number: " + max);
    }
}
