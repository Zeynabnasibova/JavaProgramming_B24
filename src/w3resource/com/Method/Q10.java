package w3resource.com.Method;

public class Q10 {

    /*
    Write a Java method to check whether a year (integer) entered by the user is a leap year or not.

Expected Output:

Input a year: 2017
false
     */

    public static void main(String[] args) {

        int year = 2000;

        leapYeaar(year);

    }
public static boolean leapYeaar(int year){

        if(year % 4 == 0 || year % 400 == 0 && year % 100 != 0){

            System.out.println("true");
            return true;

        }else{

            System.out.println("false");
            return false;
        }


}


}
