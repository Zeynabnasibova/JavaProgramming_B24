package w3resource.com.Method;

public class Q6 {

    /*
    . Write a Java method to compute the sum of the digits in an integer. Go to the editor
Test Data:
Input an integer: 25
Expected Output:

The sum is 7
     */

    public static void main(String[] args) {

        int num = 1234;

        sumOfDigits(num);

    }
    public static int sumOfDigits(int num){


     int sum = 0;

     int i = 0;

       while(num > 0){

            sum += num % 10;

            num = num / 10;

            i++;
        }

        System.out.println(sum);
        return sum;
    }

}
