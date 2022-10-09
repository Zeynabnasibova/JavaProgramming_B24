package w3resource.com.Array;

public class Q2 {

    public static void main(String[] args) {

        /*
        Write a Java program to sum values of an array. Go to the editor
         */

        int [] num = {1, 2, 3, 4, 5};

        int sum = 0;
        for(int i = 0; i < num.length;i++ ){

            sum += num[i];
        }
        System.out.println(sum);



        for (int each : num) {
            sum +=each;

        }
        System.out.print("The sum number of:" + sum);
    }
}
