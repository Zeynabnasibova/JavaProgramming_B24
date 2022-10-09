package SamePdfTask.LoopsPractice1;

public class SumOffOddNumber {

    public static void main(String[] args) {

/*
 Write a program that can calculate the sum of all the odd numbers between 1 ~ 100
 */
        int sum = 0;

        for(int i = 1; i <= 100; i++){
            if(i%2==1){
                sum += i;

            }

        }
        System.out.println(sum);
    }
}
