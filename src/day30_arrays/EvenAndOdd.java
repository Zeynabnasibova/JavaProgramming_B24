package day30_arrays;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class EvenAndOdd {

    public static void main(String[] args) {

        /*
        declare an int array
        count how many even number there is
        count how many odd nuymbers there is

        print your counters

        challenges:
               treaditional for loop
               for each loop

               - not hard code in initial array,but use scanner to get the numbers

         */

//        int [] numbers = {9, 24, 5, 1, 5, 29, 52};

        // Here we create a dynamic array with Scanner input

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int size = input.nextInt();

        int [] numbers = new int[size];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter a number");
            numbers[i] = input.nextInt();
        }

        // counter variables
        int even = 0;
        int odd = 0;

        // String variables to be able to print all the even and odd numbers later
        String evenNumbers = "";
        String oddNumbers = "";

        // For each loop approach to find the even and odd
        for(int eachNum : numbers){

            if(eachNum % 2 == 0){
                even++;
                evenNumbers += eachNum + " ";
            } else {
                odd++;
                oddNumbers += eachNum + " ";
            }

        }

        // traditional for loop approach to find even and odd

//        for(int i = 0; i < numbers.length; i++){
//
//            if(numbers[i] % 2 == 0){
//                even++;
//                evenNumbers += numbers[i] + " ";
//            } else {
//                odd++;
//                oddNumbers += numbers[i] + " ";
//            }
//
//        }

        // printing

        System.out.println(Arrays.toString(numbers));
        System.out.println("Even: " + even);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd: " + odd);
        System.out.println("odd numbers: " + oddNumbers);

    }
}
