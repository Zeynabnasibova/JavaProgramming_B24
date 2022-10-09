package w3resource.com.Array;

public class Q4 {
    public static void main(String[] args) {

        /*
        Write a Java program to calculate the average value of array elements.
         */


        int[] num = new int[]{23, 45, 77, 19, -100};

        int sum = 0;
        double average = 0;

        for(int i = 0; i  < num.length; i++){

            sum += num[i];

            average = sum/num.length;
        }

        //System.out.println(sum);
        System.out.println(average);

    }
}

