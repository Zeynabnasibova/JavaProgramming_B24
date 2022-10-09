package ReplitTask.String;
import java.util.Scanner;
public class Find_A_User2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Write a program that will look up for user.
        Assume that you have only 2 users: Max Payne and Alan Wake.
        First, aks user to enter full name.Display message: "Enter full name:".
        Then take input from user.
        If name is equals to either "Max Payne" or "Alan Wake",display message:"User found:".
        Otherwise, display message: "User not found!".
        Please
         */

        System.out.println("Enter full name:");
        String fullName = input.nextLine();

        if(fullName.equalsIgnoreCase("Max Payne") || fullName.equalsIgnoreCase("Alan Wake")){
            System.out.println("User found");
        }else{
            System.out.println("User not found");
        }
    }
}
