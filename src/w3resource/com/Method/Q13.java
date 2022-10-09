package w3resource.com.Method;

public class Q13 {

    /*
    Write Java methods to calculate the area of a triangle.

Expected Output:

Input Side-1: 10
Input Side-2: 15
Input Side-3: 20
The area of the triangle is 72.6184377413890
     */

    public static void main(String[] args) {

        area_of_a_triangle(30,30);

    }

// Area = width * hight /2

    public static double area_of_a_triangle(int hight, int width){

        double areaOfATriangle = width * hight /2;

        System.out.println(areaOfATriangle);
        return  areaOfATriangle;

    }
}
