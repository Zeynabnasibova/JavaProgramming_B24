package w3resource.com.String;

public class _20canonicalRepresentation {

    public static void main(String[] args) {

        /*

         Write a Java program to get the canonical representation of the string object.

         */

        // Create three strings in three different ways.
        String str1 = "Java Exercises";
        String str2 = new StringBuffer("Java").append(" Exercises").toString();
        String str3 = str2.intern();

        // Determine which strings are equivalent using the ==
        // operator (as compared to calling equals(), which is
        // a more expensive operation.
        System.out.println("str1 == str2? " + (str1 == str2));
        System.out.println("str1 == str3? " + (str1 == str3));
    }
}
