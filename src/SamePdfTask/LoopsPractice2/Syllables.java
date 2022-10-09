package SamePdfTask.LoopsPractice2;
import java.util.Scanner;
public class Syllables {

    public static void main(String [] args){

        /*
        Syllables
Given a String separated by dashes calculate how many syllables the words are
Ex:
Input:
ja-va Output:
2
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your word");
        String name = input.nextLine();


        int count = 0;
     for(int i = 0; i < name.length();i++){

         if(name.charAt(i)=='-'){
             count++;
         }
     }
        System.out.println(count+1);
    }
}
