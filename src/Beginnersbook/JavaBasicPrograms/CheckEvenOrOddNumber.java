package Beginnersbook.JavaBasicPrograms;
import java.util.Scanner;
public class CheckEvenOrOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer number");
        int num = input.nextInt();
        if(num%2==0) {
            System.out.println(num + " is even number");
        }else if(num%2!=0) {
            System.out.println(num + " is odd number");
        }else{
            System.out.println(num + " is zero or negativ");
        }

    }
}
