package codingbat.String1;
import java.util.Scanner;
public class middleThree {

    public static void main(String[] args) {
/*
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"

 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();
      //  String str = "Candy";
        String middle = str.substring(str.length()/2-1,str.length()/2+1) + str.substring(str.length()/2+1,str.length()/2+2);
        System.out.println(middle);

        }
    }

