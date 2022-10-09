package day35_methods;

public class OurMathClass {

    /*
    add
    substract
    multiply
    divide
     */
    public static void main(String[] args) {
        add(2, 3);
        sum(3, 4);
        multiply(4, 5);
        divide(2, 3);
    }

    public static void add(double numOne, double numTwo) {
        System.out.println(numOne + " + " + numTwo + "=" + (numOne + numTwo));
    }

    public static void sum(double numOne, double numTwo) {
        System.out.println(numOne + " - " + numTwo + "=" + (numOne - numTwo));

    }

    public static void multiply(double numOne, double numTwo) {
        System.out.println(numOne + " * " + numTwo + "=" + (numOne * numTwo));

    }

    public static void divide(double numOne, double numTwo) {
        if (numTwo != 0) {

            System.out.println(numOne + " / " + numTwo + "=" + (numOne / numTwo));
        } else {
            System.out.println("Cannot divide by 0");
        }
    }
}