package w3resource.com.Method;

public class Q14 {
/*
Write a Java method to create the area of a pentagon. Go to the editor

Expected Output:

Input the number of sides: 5
Input the side: 6
The area of the pentagon is 61.93718642120281
 */

    public static void main(String[] args) {

        area_Pentagon(13,6);

    }
public static double area_Pentagon(double s, double b){


        double area_pentagon  =  5 /2  * s * b;

    System.out.println(area_pentagon);

    return area_pentagon;
}

}
// area pentagon = num * side * num/2