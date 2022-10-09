package SamePdfTask.StringPractice2;
import java.util.Scanner;
public class ReplaceProgramContane {

    public static void main(String[] args) {
/*
[ Replace program]
Will do this later when we learn replace method
Given a String message with some text and a number (1-3) replace certain characters from the String message.
When the number is:
1: replace 'a' with 'e'
2: replace 's' with 'r'
3: replace 'o' with 'z'
Ex:
message: java class is fun
number: 1
Output: jeve cless is fun
Ex:
message:
 java class is fun
 number: 2
 Output: java clarr ir fun
 */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = input.nextLine();


        if(word.contains("a")){
            System.out.println(word.replace("a","e"));
        }if(word.contains("s")){
            System.out.println(word.replace("s","r"));
        }if(word.contains("o")){
            System.out.println(word.replace("o","z"));
        }

    }
}
