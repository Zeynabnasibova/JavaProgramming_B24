package SamePdfTask.LoopsPractice1;

public class EvenNumberDivisible {

    public static void main(String[] args) {

        /*
         Write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5

         */

        for(int i = 0; i <=100; i++){
            if(i%2==0 && i%3==0 && i%5==0){

                System.out.println(i);
            }


        }
    }
}
