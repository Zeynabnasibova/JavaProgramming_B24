package ProgrammizCom.LoopTask;

public class DisplaySumOfnNaturalNumbers {

    public static void main(String[] args) {

        int sum = 0;
        int n = 1000;

        // for loop
        for (int i = 1; i <= n; ++i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }

        System.out.println("Sum = " + sum);


        int sum1 = 0;
        int n1 = 1000;

        // for loop
        for (int i = n1; i >= 1; --i) {
            // body inside for loop
            sum1 += i;     // sum = sum + i
        }

        System.out.println("Sum1 = " + sum1);

    }
}
