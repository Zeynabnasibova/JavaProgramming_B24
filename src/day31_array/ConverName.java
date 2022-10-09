package day31_array;
import java.util.Scanner;
import java.util.Arrays;
public class ConverName {

    public static void main(String[] args) {

        Scanner input = new Scanner((System.in));
        System.out.println("Enter your first name'");
        String name = input.nextLine();
// you can also store to a variablle:
        char [] firstName = name.toCharArray();



        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toCharArray()[0]);

        System.out.println(name.toCharArray()[0]);
        System.out.println(firstName[0]);
        System.out.println(firstName[firstName.length - 1]);

        System.out.println(firstName[0] + " " + firstName[1]);




    }
}
