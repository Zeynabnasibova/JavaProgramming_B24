package w3resource.com.String;

public class _2charAtUnicodeCodePoint {
    public static void main(String[] args) {
    /*

     Write a Java program to get the character (Unicode code point) at the given index within the ReplitTask.String.
     Sample Output:

Original ReplitTask.String : w3resource.com
Character(unicode point) = 51
Character(unicode point) = 101
     */
           //         012345678910111213
        String str = "w3resource.com";
        System.out.println(("Original ReplitTask.String : " + str));

        // codepoint at index 1
        int val1 = str.codePointAt(1);
        //prints character at index1 in string
        System.out.println("Character(unicode point) = " +val1);

        //codepoint at index9
        int val2 = str.codePointAt(9) ;
        //prints character at index9 in string
        System.out.println("haracter(unicode point) = " + val2);

        System.out.println(str.codePointAt(1));
        System.out.println(str.codePointAt(9));

        System.out.println();

        int unicode1 = str.charAt(1);
        System.out.println(unicode1);
        System.out.println(str.charAt(1));
        System.out.println(str.codePointAt(1));
        System.out.println(str.codePointBefore(1));
        System.out.println(str.codePointCount(1,10));



    }
}
