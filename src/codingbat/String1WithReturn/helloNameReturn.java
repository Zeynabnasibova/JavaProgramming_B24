package codingbat.String1WithReturn;

import java.util.Scanner;

public class helloNameReturn {
    /*

Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
     */

    public static String helloName(String name) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        name = input.nextLine();

        name = "Hello ".concat(name) + "!";

       System.out.println(name);

        return name;
    }


// I can call my metod in here

    public static void main(String[] args) {

      //  helloName("Zeynab");

        //              my metod name
        //                      |
       // System.out.println( helloName("Zeynab"));

        //helloName("Zeynab");
    }
    }

