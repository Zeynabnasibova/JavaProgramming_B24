package day10_scanner;

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
        System.out.println("Enter your age");
        byte age = input.nextByte();

        System.out.println("Enter your favorite number");
        long favoriteNum = input.nextLong();

        System.out.println("Are you a student: true or false");
        boolean isStudent = input.nextBoolean();

        System.out.println("This is your personal info:");
        System.out.println("age: " + age);
        System.out.println("favorite number: " + favoriteNum);
        System.out.println("are you a student: " + isStudent);

    }
}
