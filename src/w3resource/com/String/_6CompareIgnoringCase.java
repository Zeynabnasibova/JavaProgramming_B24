package w3resource.com.String;

public class _6CompareIgnoringCase {
    public static void main(String[] args) {
        /*
        Write a Java program to compare two strings lexicographically, ignoring case differences.
        ReplitTask.String 1: This is exercise 1
ReplitTask.String 2: This is Exercise 1
"This is exercise 1" is equal to "This is Exercise
         */
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";

        System.out.println("ReplitTask.String 1: " + str1);
        System.out.println("ReplitTask.String 2: " + str2);

        //Compare the two strings.
        int result = str1.compareToIgnoreCase(str2);

        //Display the result of the comparison
        if(result < 0) {
            System.out.println("\"" + str1 + "\"" +
                    " is less than " +
                    "\"" + str2 + "\"");
        }else if(result == 0){
            System.out.println("\"" + str1 + "\"" +
                    " is equal to " +
                    "\"" + str2 + "\"");

        }else { // if(result > 0 )
            System.out.println("\"" + str1 + "\"" +
                    " is greater than " +
                    "\"" + str2 + "\"");

        }

        System.out.println();
    }
}
