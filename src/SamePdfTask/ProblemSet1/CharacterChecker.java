package SamePdfTask.ProblemSet1;
import java.util.Scanner;
public class CharacterChecker {
    public static void main(String[] args) {

        /*
        [Character Checker]
        Given a letter (char) determine if the character is an uppercase letter or lowercase letter
        Ex: 'b'  --> lowercase
        'G' --> uppercase
        'O'  --> uppercase
        Hint: Use the ASCII table
         */
        Scanner input = new Scanner(System.in);
        char letter = input.next().charAt(0);

        if(letter >= 'a' && letter <= 'z'){
            System.out.println(letter+ " lowercase");
        }else if(letter >= 'A'&& letter<='Z'){
            System.out.println(letter+ " uppercase");
        }else{
            System.out.println(letter + "not latin alphabit");
        }
    }
}
