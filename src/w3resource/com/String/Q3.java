package w3resource.com.String;

public class Q3 {

    public static void main(String[] args) {

        /*
        Write a Java program to get the character (Unicode code point) before the specified index within the String.

        Original String : w3resource.com
Character(unicode point) = 119
Character(unicode point) = 99

         */

        String str = "w3resource.com";

        int index1 = str.codePointAt(0);

        int index2 = str.codePointAt(8);

        System.out.println(index1);

        System.out.println(index2);


    }
}
