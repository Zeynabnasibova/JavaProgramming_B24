package day30_arrays;
import java.util.Arrays;
import java.util.Scanner;
public class BankAccount {

    public static void main(String[] args) {

        /*
            String array
            0 - First name
            1 - account number
            2 - balance
            3 - account type
            do it 3 ways:
                create array with values
                create empty array and fill with values
                create empty array and fill with values through scanner
         */

        String [] bankAccountOne = { "James", "303999114", "$99040.43", "Checking"};

        String [] bankAccountTwo = new String[4];
        bankAccountTwo[3] = "Saving";
        bankAccountTwo[2] = "13303.32";
        bankAccountTwo[1] = "30101441";
        bankAccountTwo[0] = "Jamie";

        // String [] arr = new String[]{"one", "two"}; valid

        String [] bankAccountThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        bankAccountThree[0] = input.next();
        System.out.println("Enter your account number");
        bankAccountThree[1] = input.next();
        System.out.println("Enter your balance");
        bankAccountThree[2] = input.next();
        System.out.println("Enter your account type");
        bankAccountThree[3] = input.next();
        // Dynamic scanner input with arrays

        String [] bankAccountFour = new String[4];
        String [] questions = {"first name", "account number", "balance", "account type"};

        for(int i = 0; i < bankAccountFour.length; i++){
            System.out.println("Enter your " + questions[i]);
            bankAccountFour[i] = input.next();
        }

        // Print all arrays
        System.out.println("First account: " + Arrays.toString(bankAccountOne));
        System.out.println("Second account: " + Arrays.toString(bankAccountTwo));
        System.out.println("Third account: " + Arrays.toString(bankAccountThree));
        System.out.println("Fourth account: " + Arrays.toString(bankAccountFour));


    }
}
