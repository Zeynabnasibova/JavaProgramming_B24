package az_Grup;
import java.util.Scanner;
public class areaPerimetrOfARectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*

        Write a Java program to print the area and perimeter of a rectangle
Width = 5.5 Height = 8.5
         */


    double width = 5.5;
    double height = 8.5;
    double area = width * height;
    double perimetr = 2 * (height + width);

        System.out.println("Area of a rectangle is: " + area  + "\n" + "Perimetr of a rectangle is: " + perimetr);
    }
}
