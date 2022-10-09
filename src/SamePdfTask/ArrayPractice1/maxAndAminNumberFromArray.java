package SamePdfTask.ArrayPractice1;

public class maxAndAminNumberFromArray {

    public static void main(String[] args) {

        /*
        Max and Min number from Array
        •Write a program that can find the maximum number from any given int array
        •Write a program that can find the minimum number from any given int array
         */

        int [] num = {4, 1, 15, 2};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < num.length; i++){

            if (num[i] > max) {

               max = num[i];


            }else if (num[i] < min){
                min = num[i];

            }

        }

        System.out.println("Max number: " + max);

        System.out.println("Min number " + min);

    }
}
