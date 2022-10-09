package ReplitTask.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class AverageTemperature003 {

    public static void main(String[] args) {

        /*
        Given an array temps with temperature values find and print the average value

Example:

input: 80 88 88 84 82 78 60 68

output: 78.5
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your double number");
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
        System.out.println(Arrays.toString(temps));

        // Do not touch above. Use array temps
int average = 0;
int sum = 0;
for(int i = 0; i < temps.length; i ++ ){

    sum += temps[i];

    average = sum / temps.length;


}
        System.out.println(sum);
        System.out.println(average);

    }
}
