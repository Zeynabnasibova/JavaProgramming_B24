package SamePdfTask.Scanner_Practice;
import java.util.Scanner;
public class placeOrder {
    /*
   create a class PlaceOrder
   create a main method
   create a Scanner object
   Ask the user enter the product name (ReplitTask.String, multiple words)
   Ask the user to enter the price (double)
   Ask the user to enter the quantity(int)
   Ask the user to enter their full name (ReplitTask.String, multiple word)
   Print in the following format:"$firstName, your order for $quantity $product Name has been placed. Your total is $totalCost(price * quantity)."
   Ex:Input: "Apples" , 1.5, 5. "Luke"
   Output: Luke, your order for 5 Apples has been places. Your total is 7.5._______
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name");
        String productName = input.next();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        System.out.println("Enter your full name");
        String fullName = input.next();

        double totalCost = (price * quantity);

        System.out.println(fullName + ", your order for " + quantity  + " "+ productName +" has been placed. \n" + "Your total is " +  totalCost);

    }
}
