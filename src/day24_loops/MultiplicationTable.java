package day24_loops;

public class MultiplicationTable {

    public static void main(String[] args) {

 /*
        number
        number x 1
        number x 2
        number x 3
     */


            int number = 4;

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }

    }
