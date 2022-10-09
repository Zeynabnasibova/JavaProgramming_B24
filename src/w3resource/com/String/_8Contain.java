package w3resource.com.String;

public class _8Contain {
    public static void main(String[] args) {
        /*

        Write a Java program to test if a given string contains the specified sequence of char values.
        Sample Output:

Original ReplitTask.String: PHP Exercises and Python Exercises
Specified sequence of char values: and
true
         */

        String str1 = "PHP Exercises and Python Exercises";
        String str2 = "and";
        System.out.println("Original ReplitTask.String: " + str1);
        System.out.println("Specified sequence of char values: " + str2);
        System.out.println(str1.contains(str2));

    }
}
