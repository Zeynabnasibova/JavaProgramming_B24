package w3resource.com.ConditionalStatement;
import java.util.Scanner;
public class Q7 {

    public static void main(String[] args) {

        /*
         Write a Java program to find the number of days in a month.

Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your month number");

        int monthNum = input.nextInt();

        System.out.println("Enter your year");

        int yearNum = input.nextInt();

        if (monthNum == 1) {
            System.out.println("January " + yearNum + " has 31 days");
        } else if (monthNum == 3) {
            System.out.println("March " + yearNum + " has 31 days");
        } else if (monthNum == 4) {
            System.out.println("April " + yearNum + " has 30 days");
        } else if (monthNum == 5) {
            System.out.println("May " + yearNum + " has 31 days");
        } else if (monthNum == 6) {
            System.out.println("June " + yearNum + " has 30 days");
        } else if (monthNum == 7) {
            System.out.println("July " + yearNum + " has 31 days");
        } else if (monthNum == 8) {
            System.out.println("August " + yearNum + " has 31 days");
        } else if (monthNum == 9) {
            System.out.println("September " + yearNum + " has 30 days");
        } else if (monthNum == 10) {
            System.out.println("October " + yearNum + " has 31 days");
        } else if (monthNum == 11) {
            System.out.println("November " + yearNum + " has 30 days");
        } else if (monthNum == 12) {
            System.out.println("December " + yearNum + " has 31 days");
        } else if (monthNum == 2 && yearNum % 4 == 0 || yearNum % 400 == 0 && yearNum % 100 != 0) {
            System.out.println("February " + yearNum + " has 29 days");
        } else {
            System.out.println("February " + yearNum + " has 28 days");
        }
    }
}
