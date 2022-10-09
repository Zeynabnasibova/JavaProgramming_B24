package SamePdfTask.LoopsPractice2;
import java.util.Scanner;
public class CountUpperLowerAndNumbers {

    public static void main(String[] args) {

        /*
        Count upper, lower, and numbers
Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
Ex:
Input: 2juMp41EEkd4s4
Output:
3 uppercase letters
6 lowercase letters
5 numbers
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();

        int upper = 0;
        int lower = 0;
        int number = 0;

        for(int i = 0; i < word.length(); i++){
            char character = word.charAt(i);
            if(character>='a' && character<='z'){
                lower++;
            }if(character>='A' && character<='Z'){
                upper++;
            }if(character>='0' && character<='9')
                number++;
       }
        System.out.println("Upper letter: "+upper);
        System.out.println("Lower letter: " +lower);
        System.out.println("numbers: " + number);
    }
}
