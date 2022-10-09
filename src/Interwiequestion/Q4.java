package Interwiequestion;

public class Q4 {

    public static void main(String[] args) {

        /*
        reverse number
         */


        int number = 4652;
        int reverseNumber = 0;
        while(number > 0){
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }

        System.out.println(reverseNumber);
    }

}
