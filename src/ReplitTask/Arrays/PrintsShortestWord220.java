package ReplitTask.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintsShortestWord220 {

    public static void main(String[] args) {

        /*
        Write a program that will find out shortest words in the given string str. If there are few words that are evenly short, print them all. Use split method in order to split str string variable and create an array of strings. Print array with Arrays.toString() method. Sort array before printing.

Hint: Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your words");
        String str = scan.nextLine();
       // System.out.println(str);
        // write your code below


        String [] words = str.split(", ");

        String smallest = words[0];

        String shortestWords = "";

        for(int i=0;i<words.length;i++){

            if(words[i].length() < words[0].length()){

                smallest = words[i];
            }

        }

        for(int i=0; i<words.length;i++){

            if(words[i].length() == smallest.length()){

                shortestWords += words[i]+" ";

            }
        }

        //shortestWords = shortestWords.trim();

        String [] words2 = shortestWords.split(" ");

        Arrays.sort(words2);

        System.out.println(Arrays.toString(words2));


    }
}
