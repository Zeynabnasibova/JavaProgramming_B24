package az_Grup;
import java.util.Scanner;
public class taskScannerNestedif {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println("Input number");
    int n = input.nextInt();

    if(n%2 != 0){
        System.out.println("Wierd");
    }else if(n%2 ==0 && n>=2 && n<=5){
        System.out.println("Not Weird");
    }else if(n%2==0 && n >=6 && n<=20){
        System.out.println("Weird");
    }else if(n%2==0 && n>20){
        System.out.println("Not Weird");
    }
//    nested if

//        if(n%2==1){
//            System.out.println("Weird");
//        }else {
//            if(n>=2&&n<=5){
//                System.out.println("Not Weird");
//            }else if(n>=6&&n<=20){
//                System.out.println("Weird");
//            }else if(n>20){
//                System.out.println("Not Weird");
//            }
        }

    }


