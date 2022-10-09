package w3resource.com.String;

public class _5compare {
    public static void main(String[] args) {
        /*
         Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
         ReplitTask.String 1: This is Exercise 1
         ReplitTask.String 2: This is Exercise 2
"This is Exercise 1" is less than "This is Exercise 2"
         */
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 1";

        System.out.println("ReplitTask.String 1: " + str1);
        System.out.println("ReplitTask.String 2: " + str2);

        //Compare the two strings.
        int result = str1.compareTo(str2);

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

        String letter1 = "abcde";
        String letter2 = "ab";
        String lettter3 = "ab";
        System.out.println(letter1.compareTo(letter2));

        boolean compare1 = letter1.equals(letter2);
        boolean compare2 = letter2.equals(lettter3);

        int d = letter1.indexOf("d", 0);


        System.out.println(compare1);
        System.out.println(compare2);

        System.out.println(d);




    }
}
