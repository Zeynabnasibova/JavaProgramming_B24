package w3resource.com.String;

public class Q2 {
    public static void main(String[] args) {

        /*
        Write a Java program to get the character (Unicode code point) at the given index within the String.

        Original String : w3resource.com
Character(unicode point) = 51
Character(unicode point) = 101
         */



        String str = "w3resource.com";

        // codepoint at index 1
        int val1 = str.codePointAt(1);


        // codepoint at index 9
        int val2 = str.codePointAt(9);

        // prints character at index1 in string
        System.out.println("Character(unicode point) = " + val1);
        // prints character at index9 in string
        System.out.println("Character(unicode point) = " + val2);



        char val = 51;
        System.out.println(val);



    }
}
