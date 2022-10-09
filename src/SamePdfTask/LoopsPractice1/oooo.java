package SamePdfTask.LoopsPractice1;
import java.util.Locale;
import  java.util.Scanner;
public class oooo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

  /*
[Max and Min from 5 numbers]•Write a program that can ask the user "enter a number" five times and return the maximum number•Write a program that can ask the user "enter a number" five times and return the minimum number
   */


        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for(int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number");
            int number = input.nextInt();
            if(number>maxNum){
                maxNum = number;

            }if(number<minNum){
                minNum = number;

            }
        }


        }

    }


