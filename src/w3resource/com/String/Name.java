package w3resource.com.String;
import java.util.Locale;
import java.util.Scanner;
public class Name {

    public static void main(String[] args) {

        /*
        Ask the user to enter their first name
    Ask the user to enter their last name
    make sure the name is properly formatting
        each first letter of both names is capital and the rest are lowercase
        EX:
           input: jamES boND
           output: James Bond
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Eneter your first name");
        String firstName = input.nextLine().toLowerCase().trim();

        System.out.println("Enter your last name");
        String lastName =input.nextLine().toLowerCase().trim();

String newFirstName = firstName.toUpperCase().substring(0,1) + firstName.substring(1,firstName.length());
String newLastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1,lastName.length());
        System.out.println(newFirstName + " " + newLastName);




    }
}
