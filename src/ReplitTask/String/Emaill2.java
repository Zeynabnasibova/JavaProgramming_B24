package ReplitTask.String;
import java.util.Locale;
import java.util.Scanner;
public class Emaill2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
         */
        System.out.println("Enter your first name");
        String firstName = input.nextLine().toLowerCase();

        System.out.println("Enter your last name");
        String lastName = input.nextLine().toLowerCase();

        System.out.println("Enter your email");
        String email = input.nextLine().toLowerCase();

        firstName = email.substring(0,email.indexOf("_"));
        lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));

        String domain = email.substring(email.indexOf("@"),email.indexOf("."));

        System.out.println(firstName.toUpperCase().charAt(0)+ firstName.substring(1,firstName.length()));
        System.out.println(lastName.toUpperCase().charAt(0)+ lastName.substring(1,lastName.length()));

        System.out.println(domain);
    }
}
