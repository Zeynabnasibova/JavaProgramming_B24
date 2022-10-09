package w3resource.com.Method;

public class Q4 {

    /*
 Write a Java method to count all vowels in a string.
 Test Data:
Input the string: w3resource
Expected Output:
     */

    public static int countVowel(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u') {

                count++;

            }


        }
        System.out.println(count);
        return count;
    }


    public static void main(String[] args) {


        countVowel("Zeyneb");
    }
}
