package ReplitTask.Arrays;


import java.util.Scanner;

public class FindingMaxLengthinStringArray013 {
    public static void main(String[] args) {

        /*
Given the array words find and print the word with the largest length. Assume that there are no 2 words with longest length

Example:

words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]

Outputs: jaaaaavvaaaaaaaaaa

         */
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            System.out.println("Enter your word" + (i+1));
            words[i] = input.nextLine();
        }
     //   System.out.println(Arrays.toString(words));
        //write your code below

        String longest = words[0];// String longest = "";

        for(int i = 0; i < words.length; i++){

            if(words[i].length() > longest.length()){

                longest = words[i];
            }
        }

        System.out.println(longest);
    }
}
