package day16_switch;
import java.util.Scanner;
public class TrafficLight {
    public static void main(String[] args) {

        boolean isGreen = true;
        String action = isGreen ? "go" : "stop" ;
        System.out.println(action);

        String name = "Nadir";
        String className = name.equals("Nadir") ? "Soft skils" : "Java";
        System.out.println(className);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println( number % 2 == 0 ? "Even number" : "Odd number");

    }
}
