package day09_scanner_logical;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int one = keyboard.nextInt();
        int two = keyboard.nextInt();
        int three = keyboard.nextInt();

        String msg = one + " + " + two + " + " + three + " = ";

        System.out.println(msg + (one + two + three));
    }
}
