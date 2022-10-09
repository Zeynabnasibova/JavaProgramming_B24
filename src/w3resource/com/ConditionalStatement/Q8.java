package w3resource.com.ConditionalStatement;
import java.util.Scanner;
public class Q8 {

    public static void main(String[] args) {

        /*
         Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message. Go to the editor

Test Data
Input an alphabet: p
Expected Output :
Input letter is Consonant

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your letter");

        String letter = input.nextLine();

        if (letter.length() > 1) {

            System.out.println("error message");

        }else if(letter.length()==1){

            for (int i = 0; i < letter.length(); i++) {


                if (letter.charAt(i) == 'a' || letter.charAt(i) == 'e' || letter.charAt(i) == 'o' || letter.charAt(i) == 'u' || letter.charAt(i) == 'i') {

                    System.out.println("Input letter is Vowel");


                } else if (letter.charAt(i) != 'a' || letter.charAt(i) != 'e' || letter.charAt(i) != 'o' || letter.charAt(i) != 'u' || letter.charAt(i) != 'i') {

                    System.out.println("Input letter is Consonant");

                } else {
                    System.out.println("error message");
                }

            }

        }
    }
}
