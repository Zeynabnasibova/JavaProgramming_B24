package Javatpoint.JavaStringFAQsorInterviewQuestions;

public class Q5Palindrome {

    public static void main(String[] args) {
        /*
        5) How to check Palindrome String in java?
        Input:

nitin
Output:

true
Input:

jatin
Output:

false

What is a Palindrome Number?

A Palindrome no. is the number that remains the same when its digits get reversed. Ex: 15451, for example: If we take 131 and reverse it then after reversing the number remains the same.
         */

        String name = "abba";
        String reverse ="";
        for(int i = name.length()-1;i >=0;i--){
            reverse += name.charAt(i);

        }
        System.out.println(reverse);
        if(name.equals(reverse)){
            System.out.println("Polindrome");
        }else{
            System.out.println("not Polindrome");
        }
    }
}
