package codingbat.String1WithReturn;

public class extraFrontReturn {

    /*

Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.


extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
     */
    public static String extraFront(String str) {

        if (str.length() > 1) {

            str = str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);

            System.out.println(str);

            return str;

        }else{

            str = str + str + str;

            System.out.println(str);

            return str;

        }
    }

    public static void main(String[] args) {

        extraFront("Hello");
    }
}
