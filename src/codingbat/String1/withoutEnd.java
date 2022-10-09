package codingbat.String1;

public class withoutEnd {

    public static void main(String[] args) {

        /*
        Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.


withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
         */

        String str = "Hello";
        String newStr = str.substring(1,str.length()-1);
        System.out.println(newStr);
    }
}
