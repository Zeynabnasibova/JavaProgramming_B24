package SamePdfTask.Scanner_Practice;
import java.util.Scanner;
public class RateCalculator {
    /*
    create a class RateCalculator
    create a main method
    create a Scanner object
    Ask the user to enter a salary (double)
    Print the hourly rate (double) of the employee
    assume that one year has 52 weeks
    hourRate = salary / (weeklyHour * 52)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter salary");
        double salary = input.nextDouble();

        System.out.println("How many hours do you work a week?");
         double weeklyHour = input.nextDouble();

        double hourRate = salary / (weeklyHour * 52);

        System.out.println("Hourly rate of the employee is: " + hourRate);
    }
}
