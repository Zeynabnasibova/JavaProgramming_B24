package SamePdfTask.StringPractice1;
import java.util.Scanner;
public class UsernameAndPassword {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
[Username and Password]
Given a username and password verify they are valid.
-The password cannot be less than 5 characters
If it is less print: "Password cannot be less than 5 characters"
If it is more than or equal to 5 print: "Valid password"
-Also,the password should not contain the username
-If the password has the username in it print:
"Invalid password, username should not be in it"
Also change the password to have the value: "password"

         */

        System.out.println("Enter your Username");
        String userName = input.nextLine();

        System.out.println("Enter your password");
        String password = input.nextLine();

        if(password.length() < 5){
            System.out.println("Password cannot be less than 5 characters");
        }if(password.length() >= 5 && !password.contains(userName) ) {
            System.out.println("Valid password");
        }if(password.contains(userName)){
            System.out.println("Invalid password, username should not be in it");
        }else{

        }
        }
}

