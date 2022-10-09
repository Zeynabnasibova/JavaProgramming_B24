package w3resource.com.String;

public class _26StringStarts {

    public static void main(String[] args) {

        /*
         Write a Java program to check whether a given string starts with the contents of another string.

         */
        String str1 = "Red is favorite color.";
        String str2 = "Orange is also my favorite color.";

        // The ReplitTask.String to check the above two Strings to see
        // if they start with this value (Red).
        String startStr = "Red";

        // Do either of the first two Strings start with startStr?
        boolean starts1 = str1.startsWith(startStr);
        boolean starts2 = str2.startsWith(startStr);

        // Display the results of the startsWith calls.
        System.out.println( str1 + " starts with " +
                startStr + "? " + starts1);
        System.out.println(str2 + " starts with " +
                startStr + "? " + starts2);

        System.out.println(str1.startsWith(startStr));
        System.out.println(str2.startsWith(startStr));
    }
}
