package day19_string;

public class Polindrome {
    public static void main(String[] args) {

      /*
            In this approach we will reverse the String manually
            Then check if the String is the same as the original
         */

        String word = "abc";
        String reverse = "" + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println(reverse);

        if (word.equals(reverse)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }

}
