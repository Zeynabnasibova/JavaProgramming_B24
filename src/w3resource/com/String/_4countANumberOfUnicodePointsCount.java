package w3resource.com.String;

public class _4countANumberOfUnicodePointsCount {
    public static void main(String[] args) {

        /*
         Write a Java program to count a number of Unicode code points in the specified text range of a ReplitTask.String

        Sample Output:

Original ReplitTask.String : w3rsource.com
Codepoint count = 9
         */
        String str = "w3rsource.com";
        System.out.println("Original ReplitTask.String : " + str);

        //codepoint from index 1 to index 10
        int ctr = str.codePointCount(1,10);

        //prints character from index 1 to index 10
        System.out.println("Codepoint count = " + ctr);

        System.out.println(str.codePointCount(1,10));
    }
}
