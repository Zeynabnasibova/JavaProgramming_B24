package SamePdfTask.Metod;

import java.util.Arrays;

public class count {


        /*
            Create a method that accepts an int array. Count how many even and odd numbers there is. Print an array at the end where the first element is how many even numbers there was and the second element in the number of odd elements

    Ex:
        input: ( {1, 2, 3, 4}) -> [ 2, 2 ]

        input: ( {1, 3, 5, 2}) -> [ 1, 3 ]
         */
        public static void main(String[] args) {


           int [] nums = {1,2,3,4};// ----> even 2
                                   // -----> odd 2
           int [] nums2 = new int [2];


            evonOdd(nums,nums2);

        }

        public static void evonOdd(int [] nums,int [] nums2){

//            int [] nums = {1, 2, 3, 4};

            int countEven = 0;
            int countOdd = 0;

            for ( int i = 0; i < nums.length; i++){

                if(nums [i] % 2 == 0){
                    countEven++;
                }else if(nums [i] % 2 == 1){
                    countOdd++;

                }
            }
//            System.out.println(countEven);
//            System.out.println(countOdd);

            nums2 [0] = countEven;
            nums2 [1] = countOdd;
            System.out.println(Arrays.toString(nums2));
        }


}
