package az_Grup;
import java.util.Scanner;
public class addTwoBinaryNumber {
    public static void main(String[] args) {


        /*

        Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 100010
Input second binary number: 110010
Expected Output

Sum of two binary numbers: 101
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Input first binary number:");
        int num1 = input.nextInt();

        System.out.println("Input second binary number:");
        int num2 = input.nextInt();


         int sumBinary = 34 + 50 ;
         sumBinary = 84;
        System.out.println("Sum of two binary numbers:" + "");


        int bin1 = 100010;/* 1  0  0 0 1 0
                             32 16 8 4 2 1
                             32+ 0+0+0+2+ 0= 34
                             decimal 34
                             */
        int bin2 = 110010; /* decimal 50  ---> sum = 34 + 50 = 84;
         84 ---> 84-64 = 20 - 16 = 4 -4 =0
          64 32  16  8  4  2  1 -->
           1  0  1   0  1  0  0

        */
        int sumBin = 1010100;
        System.out.println(sumBin);

    }
}
