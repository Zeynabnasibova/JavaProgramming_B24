package Javatpoint.JavaArraysTutoriak;

import day22_loops.MinAndMax;
import day33_multidimensional_array.MaxNumberFrom2D;

public class Q3 {

    public static void main(String[] args) {

//
//        int number = 1234;
//        int reverse = 0;
//
//        while(number != 0){
//
//            int remainder = number % 10;
//
//            reverse = reverse * 10 + remainder;
//
//            number = number/10;
//        }
//        System.out.println("The reverse of the given number is: " + reverse);
//



//        int number = 1234, reverse = 0;
////we have not mentioned the initialization part of the for loop
//        for( ;number != 0; number=number/10) {
//
//            int remainder = number % 10;
//
//            reverse = reverse * 10 + remainder;
//        }
//        System.out.println("The reverse of the given number is: " + reverse);
//
//
        int number = 1234;
        int reverse = 0;

        for(;number != 0;){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number=number/10;
        }
        System.out.println(reverse);
    }
}
