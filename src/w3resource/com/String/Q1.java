package w3resource.com.String;

public class Q1 {

    public static void main (String [] args){

        /*
        Write a Java program to get the character at the given index within the String.

        Original String = Java Exercises!
The character at position 0 is J
The character at position 10 is i
         */


String str = "Java Exercises!";

String index1 = str.substring(0,1) ;

String index2 = str.substring(10,11);

        System.out.println("The character at position 0 is  " + index1 + "\nThe character at position 10 is " + index2);


        char index0 = str.charAt(0);
        char index10 = str.charAt(10);

        System.out.println("The character at position 0 is " + index0 + "\nThe character at position 10 is " + index10);
    }

}
