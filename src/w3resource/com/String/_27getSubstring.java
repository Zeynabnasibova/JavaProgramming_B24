package w3resource.com.String;

public class _27getSubstring {

    public static void main(String[] args) {

        /*

        Write a Java program to get a substring of a given string between two specified positions.

         */

        String str = "The quick brown fox jumps over the lazy dog.";

        // Get a substring of the above string starting from
        // index 10 and ending at index 26.
        String new_str = str.substring(10, 26);

        // Display the two strings for comparison.
        System.out.println("old = " + str);
        System.out.println("new = " + new_str);

        System.out.println(str.substring(4,10));

    }
}
