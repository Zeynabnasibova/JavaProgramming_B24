package codingbat.String1;

public class withouEnd2 {

    public static void main(String[] args) {

/*

Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.


withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
 */
String str = "ab";

if (str.length()>2) {
    String newStr = str.substring(1, str.length() - 1);
    System.out.println(newStr);
}else{
    System.out.println("");
}

    }
}
