package SamePdfTask.StringPractice1;
import java.util.Scanner;
public class LongestWithA {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*

        [Longest with A]
        Given three String variables of some text find and print the longest word that also contains 'a'
        Ex:
        "java"
        "mouse"
        "computer"
        Output: java
        Ex:"java"
        "mouse"
        "apples"
        Output: apples
        Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character.
         */
        System.out.println("Enter your first word");
        String firstword = input.nextLine();

        System.out.println("Enter your second word");
        String secondword = input.nextLine();

        System.out.println("Enter your third word");
        String thirdword = input.nextLine();

        String longest = "";

        if(firstword.contains("a") && firstword.length() > longest.length() ){
            longest = firstword;
        }if(secondword.contains("a") && secondword.length() > longest.length()){
            longest = secondword;
        }if(thirdword.contains("a") && thirdword.length() > longest.length()){
            longest =thirdword;
        }
        System.out.println("Longest is: " + longest);

    }
}
