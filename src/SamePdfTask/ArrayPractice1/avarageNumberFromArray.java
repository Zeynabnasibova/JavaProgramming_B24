package SamePdfTask.ArrayPractice1;

public class avarageNumberFromArray {
    public static void main(String[] args) {
        /*
        Average Number from Array
Given an int array calculate the average number -> Make it flexible so it will work with any array size
Examples:
[1,2,3] -> average: 2
[10, 15, 5, 6] -> average: 9
[4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
         */

        int [] arr = {1, 2, 3};


        int sum = 0;
        int average = 0;

        for(int i = 0; i < arr.length; i++){

            sum += arr[i];

            average = sum / arr.length;


        }
        System.out.println(sum);
        System.out.println(average);
    }
}
