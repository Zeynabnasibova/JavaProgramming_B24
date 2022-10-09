package SamePdfTask.Scanner_Practice;
import java.util.Scanner;
public class Divisible {
    /*
    create a class Divisible
    create a main method
    create a Scanner object
    Ask the user to enter a number.
    Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values
    Ex:
    Enter a number
    65
    65 is divisible by 2: false
    65 is divisible by 3: false
    65 is divisible by 5: true
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        double num = input.nextDouble();

        boolean divisibleNum1 = num % 2 == 0;
        boolean divisibleNum2 = num % 3 == 0;
        boolean divisinleNum3 = num % 5 == 0;
        System.out.println(num + "65 is divisible by 2: " + divisibleNum1);
        System.out.println(num + "65 is divisible by 2: " + divisibleNum2);
        System.out.println(num + "65 is divisible by 2: " + divisinleNum3);

    }
}
