package SamePdfTask.ArrayPractice1;

public class evenAndOdd {
    public static void main(String[] args) {



    /*
    Even and odd from array
Write a program that can count the even and odd number from an array of integers
Use for each to make it easier
Ex:
Input: [4,1,3,12,5]
Output: Even: 2
Odd: 3
     */


        int[] arr = {4, 1, 3, 12, 5};

        int count = 0;

        int evenCount = 0;

        int oddCount = 0;

        for (int i = 0; i < arr.length; i++){

            if(arr[i] % 2 == 0){

                evenCount++;

            }else if(arr[i] % 2 == 1){

                oddCount++;
            }
        }
        System.out.println("Even number: " + evenCount);
        System.out.println("Even number: " + oddCount);
     }
}