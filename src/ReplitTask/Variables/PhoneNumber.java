package ReplitTask.Variables;
import java.util.Scanner;
public class PhoneNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write area Code");
        int areaCode = input.nextInt();
        areaCode = 222;

        System.out.println("Write local Number");
        int localNumber = input.nextInt();
        localNumber = 3334444;

        String phoneNumber;

        phoneNumber = "(" + areaCode +")" + "-" + localNumber;

        System.out.println("Calling number" + phoneNumber);


    }
}
