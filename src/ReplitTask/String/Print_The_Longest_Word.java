package ReplitTask.String;
import java.util.Scanner;
public class Print_The_Longest_Word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Write a program that will print out the longest word. Note: Assume the length of the two given Strings will be different
         */
        System.out.println("Enter first word");
        String word1 = input.nextLine();
        System.out.println("Enter second word");
        String word2 = input.nextLine();

        if (word1.length() > word2.length()) {
            System.out.println(word1);
        }else if(word2.length() > word1.length()){
            System.out.println(word2);
        }

           // System.out.println((word1.length() > word2.length()) ? word1 : word2);
        }
    }