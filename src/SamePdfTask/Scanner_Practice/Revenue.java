package SamePdfTask.Scanner_Practice;
import java.util.Scanner;
public class Revenue {
    /*
    create a class Revenue
    create a main method
    create a Scanner object
    Ask the user to enter product price and quantity and then calculate the revenue. revenue = price * quantity
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter product price");
        double productPrice = input.nextDouble();;

        System.out.println("Enter product quantity");
        double productQuantity = input.nextDouble();

        double revenue;
        revenue = productPrice * productQuantity;
        System.out.println("Revenue is equal: " + revenue);
    }
}
