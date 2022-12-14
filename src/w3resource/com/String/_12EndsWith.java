package w3resource.com.String;

public class _12EndsWith {

    public static void main(String[] args) {

        /*
        Write a Java program to check whether a given string ends with the contents of another string.
         */

        String str1 = "Python Exercises";
        String str2 = "Python Exercise";

        // The ReplitTask.String to check the above two Strings to see
        // if they end with this value (se).
        String end_str = "se";

        // Check first two Strings end with end_str
        boolean ends1 = str1.endsWith(end_str);
        boolean ends2 = str2.endsWith(end_str);

        // Display the results of the endsWith calls.
        System.out.println("\"" + str1 + "\" ends with " +
                "\"" + end_str + "\"? " + ends1);
        System.out.println("\"" + str2 + "\" ends with " +
                "\"" + end_str + "\"? " + ends2);

        System.out.println(str1.endsWith(end_str));
        System.out.println(str2.endsWith(end_str));
    }
}
