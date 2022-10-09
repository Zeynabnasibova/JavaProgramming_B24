package w3resource.com.String;

public class _25ReplaceEachSubstring {

    public static void main(String[] args) {

        /*
Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement. Go to the editor

Sample string : "The quick brown fox jumps over the lazy dog."

In the above string replace all the fox with cat.


         */

        String str = "The quick brown fox jumps over the lazy dog.";

        // Replace all the 'dog' with 'cat'.
        String new_str = str.replaceAll("fox", "cat");

        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New ReplitTask.String: " + new_str);
    }
}
