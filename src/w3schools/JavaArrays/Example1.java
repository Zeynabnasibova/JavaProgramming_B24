package w3schools.JavaArrays;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//
//        System.out.println(cars[0]);
//
//        System.out.println(Arrays.toString(cars));
//
//        System.out.println(cars.length);

// 1 metod

        //            for(String name : cars){
//
//                System.out.print(name + " ");
//            }

// 2 metod

        String arraysWord = "";

        for(int i = 0; i < cars.length;i++){

            arraysWord += cars[i] + " ";

        }
        System.out.println(arraysWord);

        String [] word = arraysWord.split(" ");


        String reverse = "";

        for(int i = word.length -1; i >= 0; i--){

            reverse += word[i] + " ";
        }
        System.out.println(reverse);

// 3 metod

//        for(int i =0; i<cars.length; i++){
//
//            System.out.print(cars[i] + " ");
//
//        }





//        String reverse = "";
//
//        for(int i = cars.length -1; i >= 0; i--){
//
//            reverse += cars[i] + " ";
//        }
//        System.out.println(reverse + " ");
    }
}
