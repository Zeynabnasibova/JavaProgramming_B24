package w3resource.com.String;

public class _18uniqueIdentifier {

    public static void main(String[] args) {

        /*
Write a Java program to create a unique identifier of a given string.

         */

        String str = "Python Exercises.";

        // Get the hash code for the above string.
        int hash_code = str.hashCode();

        // Display the hash code.
        System.out.println("The hash for " + str +
                " is " + hash_code);

        System.out.println(str.hashCode());

    }
}
