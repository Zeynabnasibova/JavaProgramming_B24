package w3resource.com.Method;

public class Q2 {

    /*
    Write a Java method to compute the average of three numbers. Go to the editor
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0

     */

    public static int averageNumber(int[] number) {
       int average = 0;
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
            //find the average value
            average = sum / number.length;
            System.out.println(average);

        }
        return average;

    }
    public static void main(String[] args) {
        int[] num = new int[]{25, 45, 65};
        averageNumber(num);
        System.out.println(averageNumber(num));
    }
}
