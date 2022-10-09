package SamePdfTask.Metod;

import java.util.Arrays;

public class SumOfAllNumbers {
    /*
     Create a method that accept an int array. Take the sum of all the numbers and print the result
     */

    public static void main(String[] args) {

        int [] n = {50, 4, 100, 90, 31};
      sumNnumbers(n);


    }
    public static void sumNnumbers(int [] n) {
        int sumN = 0;

        for(int i = 0; i < n.length; i++ ){

            sumN += n[i];

//        for(int eachNum : n){
//
//            sumN += eachNum;



        }
        System.out.println(sumN);
        }
    }

