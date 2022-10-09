package ReplitTask.String;
import java.util.Scanner;
public class Email1 {

    public static void main(String[] args) {

        /*
        Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter email");
        String email = input.nextLine().toLowerCase();

        if (email.contains("_")) {

            String firstName = email.substring(0, email.indexOf("_"));

            String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));

            System.out.println(lastName + "_" + firstName + "@gmail.com");

        } else {
            System.out.println(email);


        }

    }
}