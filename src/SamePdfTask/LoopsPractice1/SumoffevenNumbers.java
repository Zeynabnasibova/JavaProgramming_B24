package SamePdfTask.LoopsPractice1;

public class SumoffevenNumbers {

    public static void main(String[] args) {

        /*
        Write a program that can calculate the sum of all the even numbers between 1 ~ 100
         */
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // Cheks if i is even
                sum = sum + i; // sum += i
            }
        }
       System.out.println(sum);

    }
}
