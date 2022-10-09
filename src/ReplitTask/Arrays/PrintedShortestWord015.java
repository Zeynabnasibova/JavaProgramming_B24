package ReplitTask.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintedShortestWord015 {

    public static void main(String[] args) {

        /*
Write a program that will print the shortest word in the given array str.

input: java, cable, red, vivid, remedy, grace

output: red
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your words");
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        // Do not touch above
        //System.out.println(Arrays.toString(str));

        String shortest = str[0];

        for(int i = 0; i < str.length; i++){

           if(str[i].length() < shortest.length()){

               shortest = str[i];

           }

        }
        System.out.println(shortest);
    }
}
