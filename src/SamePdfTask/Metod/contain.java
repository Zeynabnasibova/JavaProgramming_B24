package SamePdfTask.Metod;
import java.util.Scanner;
public class contain {


        /*

    Create a method that accepts an int array and a number. Check if the array contains that number or not

    Ex:
        input: ( {1, 2, 3, 4}, 4 ) -> true

        input: ( {1, 2, 3, 4}, 7 ) -> false
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       System.out.println("Enter your arrays");
        int [] num1 = {input.nextInt(),input.nextInt(),input.nextInt(), input.nextInt()};
        System.out.println("Enter your number");
        int number = input.nextInt();
   //     contains(nums,number);
//        int [] num1 = {1,2,3,4};
//        int number = 4;

        contains(num1,number);
    }
        public static void contains(int [] num1, int number ){

//            int [] num1 = {1, 2, 3, 4};
//            int number = 4;

            boolean nums = true;
//                         0 < 4
            for(int i = 0; i < num1.length; i++ ){

                if(num1 [i] == number){

                    nums = true;

                }else{
                    nums = false;

                }
            }
            System.out.println(nums);
        }

}
