package ReplitTask.Variables;
import java.util.Scanner;
public class PatientInformation {
    /*
    Declare 9 ReplitTask.String variables firstName, lastName, fullName, email, street, state, city, address, contacts.

Declare 2 int variables: age, zipcode Declare 2 double variables: height, weight. Declare boolean variable: isMarried (for marriage status). Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

Create a Scanner object named scan.

Execution flow with example:

Welcome to the patient portal!
Please enter your personal information
Enter your first name
James
Enter your last name
May
Enter your email
jamesmay@gmail.com
Enter your street
7925 Jones Branch Dr
Enter your city
McLean
Enter your state
VA
Enter your zip code
22102
Enter your work phone number
7896542314
Enter your personal phone number
2406542314
Enter your age
35
Enter your height
5.10
Enter your weight
173.2
Are you married?
true
     */
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String firsName = "May" ,
            lastName = " James" ,
            fullName = firsName + " , " + lastName,
            email = "jamesmay@gmail.com",
            street = "7925 Jones Branch Dr",
            state = "VA",
            city = "McLean",
            address,
            contacts;
    int age = 35,
            zipcode = 22102;
    double height = 5.10,
            weight = 173.2;
    boolean isMarried = true;
    long workPnoneNumber = 7896542314l,
            personalPhoneNumber = 2406542314l;

     contacts = "work phone number - " + workPnoneNumber + ","+ " personal phone number - " + personalPhoneNumber + "," + " email: " + email;

     address = street + ", " + city + ", " + state + " " + zipcode;

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
    firsName = scan.nextLine();

        System.out.println("Enter your last name");
    lastName = scan.nextLine();

        System.out.println("Enter your email");
    email = scan.nextLine();

        System.out.println("Enter your street");
    street = scan.nextLine();

        System.out.println("Enter your city");
    city = scan.nextLine();

        System.out.println("Enter your state");
    state = scan.nextLine();

        System.out.println("Enter your zip code");
    zipcode = scan.nextInt();

        System.out.println("Enter your work phone number");
    workPnoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
    personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
    age = scan.nextInt();

        System.out.println("Enter your height");
    height = scan.nextDouble();

        System.out.println("Enter your weight");
    weight = scan.nextDouble();

        System.out.println("Are you married?");
    isMarried = scan.nextBoolean();

        System.out.println("Patient personal information");
        System.out.println("Full name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Contacts: " + contacts);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Married?: " + isMarried);

    }
}