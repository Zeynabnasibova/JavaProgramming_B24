package day16_switch;
import java.util.Scanner;
public class Ternaryractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the items name");
        String itemName = input.nextLine();

        System.out.println("Enter the price of " + itemName);
        double itemPrice = input.nextDouble();

        System.out.println("Do you have prime");
        String hasPrime = input.next();

        // Add shipping cost of 5 $ if they don't have prime

        double finalPrice = hasPrime.equals("yes") || hasPrime.equals("Yes") ? itemPrice : itemPrice + 5;
        System.out.println("Your total price for " + itemName + " $" + finalPrice);

    }
}
