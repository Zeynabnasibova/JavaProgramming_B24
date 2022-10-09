package codingbat.Warmup1;

public class startHi {

    /*

Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
     */


    public static void main(String[] args) {

        startHi("hi there");

    }

    public static boolean startHi(String str) {

        if (str.startsWith("hi")) {

            System.out.println(true);

            return true;

        } else {

            System.out.println(false);

            return false;


        }

    }
}