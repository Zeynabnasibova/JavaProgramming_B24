package codingbat.String1;

public class extraEnd {

    public static void main(String[] args) {

        /*

Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.


extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
         */
        String str = "Hello";
        String newString = str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2);
        System.out.println(newString);
    }
}
