package ReplitTask.String;
import java.util.Scanner;
public class Email2 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

/*
Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
 */

        String email = input.nextLine();

        String firstName = "";
        String lastName = "";
        String domain = "";


            firstName = email.toUpperCase().charAt(0) + email.substring(1, email.indexOf('_'));
    lastName = email.toUpperCase().charAt(email.indexOf('_') + 1) + email.substring((email.indexOf('_') + 2),email.indexOf('@'));
    domain = email.substring(email.indexOf('@') + 1, email.lastIndexOf('.'));

    System.out.println ("First name: " + firstName + "\nLast name: " + lastName + "\nDomain: " + domain);

    }
}
