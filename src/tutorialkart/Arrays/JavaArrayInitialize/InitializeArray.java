package tutorialkart.Arrays.JavaArrayInitialize;

import java.util.Arrays;

public class InitializeArray {

    public static void main(String[] args) {

       // datatype arrayName[] = new datatype[size];


        int arr [] = new int[5];

        int arr1 [] = {42, 51, 63, 90, 87};



        //

        int numbers [] = new int[5];

        for(int eachNumber : numbers){

            System.out.print(eachNumber);//00000
           }

        System.out.println();


            int num []  = new int [5];


        num[0] = 42;
        num[1] = 25;
        num[2] = 17;
        num[3] = 63;
        num[4] = 90;

            for(int eachNum : num){

                System.out.print(eachNum  + " ");


        }
        System.out.println();
        System.out.println(Arrays.toString(num));
    }
}
