package SamePdfTask.Metod;
import java.util.Scanner;
public class numbers {



        /*
          Create a method that will that accepts three numbers. Check if the three numbers equal to 180.
        If they are equal to 180 print: "This is a triangle"
        If they are equal to 360 print: "This is a circle"
         */


    public static void main(String[] args) {
        equating(160,100,100);

    }

    public static void equating(int num1, int num2, int num3) {

        if (num1+num2+num3 == 180) {
            System.out.println("This is a triangle");
        } else if(num1+num2+num3 == 360){
            System.out.println("This is a circle");

        }else{
            System.out.println("not equal");
        }


    }
}


