package day09_scanner_logical;

public class ShortCircuit {
    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(false && true);

        // System.out.println(true && 5/0 == 0); problem

        System.out.println(false && 5/0 == 0);
        // System.out.println(false & 5/0 == 0); problem

        System.out.println(true || false);

        System.out.println("or");
        System.out.println(true || 5/0 == 0);
        // System.out.println(true | 5/0 == 0);

        int count = 5;//6       ;             7

        System.out.println(count++ == 5 || ++count == 7);//5 == 5 || 7 == 7
        System.out.println(count);

        int count2 = 5;

        System.out.println(count2++ == 5 | ++count2 == 7);
        System.out.println(count2);


    }
}
