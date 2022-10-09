package SamePdfTask.Scanner_Practice;
import java.util.Scanner;
public class evenOrOdd {
    /*
    create a class EvenOrOdd
    create a main method
    create a Scanner object
    Ask the user to enter an int number, print if the number is even or odd as boolean values

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int number = input.nextInt();

        boolean evenNumber = number % 2 == 0;
        System.out.println(number + " is even: "+ evenNumber);

        boolean oddNumber = number % 2 != 0;
        System.out.println(number + " is odd: " + oddNumber );

    }
}
