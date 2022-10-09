package office_hours.practice_09_01_2021;
import java.util.Scanner;
public class PrefixAgain {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String str = scan.nextLine();// abXYabc
        int n = scan.nextInt(); // 1

        String perfix = str.substring(0,n);//ab
        String remaining = str.substring(n);//XYabc


        System.out.println(remaining.contains(perfix));
    }
}
