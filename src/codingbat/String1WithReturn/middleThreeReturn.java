package codingbat.String1WithReturn;
import java.util.Scanner;
public class middleThreeReturn {
/*

Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
 */
    public static String middleThree(String str){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        str = input.nextLine();

        str =  str.substring(str.length()/2-1,str.length()/2+1) + str.substring(str.length()/2 +1,str.length()/2 +2);

        System.out.println(str);

        return str;

    }

    public static void main(String[] args) {

        middleThree("and");
    }
}
