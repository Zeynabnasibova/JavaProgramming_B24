package w3resource.com.String;

public class _7Concatenate {
    public static void main(String[] args) {
        /*

        Write a Java program to concatenate a given string to the end of another string.
        ReplitTask.String 1: PHP Exercises and
        ReplitTask.String 2: Python Exercises
The concatenated string: PHP Exercises and Python Exercises
         */


        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        System.out.println("ReplitTask.String 1: " +str1);
        System.out.println("ReplitTask.String 2: " +str2);

        //Concatenate the two Strings together

        String str3 = str1.concat(str2);
        System.out.println("The concatenated string: " + str3);

        System.out.println(str1.concat(str2));

    }
}
