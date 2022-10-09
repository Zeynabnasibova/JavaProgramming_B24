package SamePdfTask.StringPractice1;
import java.util.Locale;
import java.util.Scanner;
public class Address {

    public static void main(String[] args) {

        /*
        [Address]
        A person will enter their address into a String. Make sure the String is not empty. If it is empty print: "No address found".
        If there is an address, make all the text uppercase to match the expected format
        Ex:
        Input: 231332 leaf ave, lake city 3132
        Output: 231332 LEAF AVE, LAKE CITY 3132
        Ex:
        Input: ""
        Output: No address found
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your address");
        String address = input.nextLine();

        if(address.equals(" ")){
            System.out.println("No address found");
        }else {

            String newAdress = address.toUpperCase();

            System.out.println(newAdress);
        }

    }
}
