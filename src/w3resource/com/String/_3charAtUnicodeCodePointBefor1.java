package w3resource.com.String;

public class _3charAtUnicodeCodePointBefor1 {
    public static void main(String[] args) {

        /*

        Write a Java program to get the character (Unicode code point) before the specified index within the ReplitTask.String.
Original ReplitTask.String : w3resource.com
Character(unicode point) = 119
Character(unicode point) = 99

         */

       String str = "w3resource.com";
        System.out.println("Original ReplitTask.String: " +str);

        //codepoint befor index 1
        int val1 = str.codePointBefore(1);

        //codepoint befor index 9
        int val2 = str.codePointBefore(9);

        //prints character before index1 in ReplitTask.String
        System.out.println("Character(unicode point) = " + val1);

        //prints character before index9 in string
        System.out.println("Character(unicode point) = " + val2);

        System.out.println(str.codePointBefore(1));
        System.out.println(str.codePointBefore(9));



        


    }
}
