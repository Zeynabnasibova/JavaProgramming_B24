package SamePdfTask.Scanner_Practice;
import java.util.Scanner;
public class PersonalInfo {
    /*
    create a class PersonalInfo
    create a main method
    create a Scanner object
    Ask the user to enter their age (byte),
ask them to enter their favorite number (long),
and ask them if they are a student (boolean).
Print all the values from the inputs
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter age");
        byte age = input.nextByte();

        System.out.println("Enter favorite number");
        long favoriteNum = input.nextLong();

        System.out.println("Are you a student? True or False ");
        boolean student = input.nextBoolean();

        System.out.println("Your age is: " +age + " \nYour favorite number is: " + favoriteNum + " \nyou are a student: " +  student);


    }
}
