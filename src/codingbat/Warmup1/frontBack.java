package codingbat.Warmup1;

public class frontBack {

    public static void main(String[] args) {


        /*

Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

         */
        frontBack("code");


    }

    public static String frontBack(String str) {
        if (str.length() == 1 || str.length() < 1) {

            return str;

        } else if (str.length() > 1) {


            String newStr = str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);

            return newStr;

        } else {

            return str;
        }

    }
}
