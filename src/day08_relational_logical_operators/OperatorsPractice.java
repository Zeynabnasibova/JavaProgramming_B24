package day08_relational_logical_operators;

public class OperatorsPractice {
    public static void main(String[] args) {
 /*
            * / %
            + -
         */

        int w = 78 / 2 * 2 + 3 - 5 % 5;
        //      39 * 2 + 3 - 5 % 5
        //      78 + 3 - 5 % 5   -> 5/5 = 1 , but no remain
        //      78 + 3 - 0
        //      81
        System.out.println("w: " + w);

        // 12 pizza 5 people. 12/5 = 2 -> 5 + 5  = 10 (given) + 2 (left over)

        System.out.println();

        int a = 8; // 7
        int b = a--; // b = 8

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println();

        int c = 1; // c = -1
        int d = -c-- + c++ / -c-- * --c;
        //      -1  + 0   /  -1   *  -1
        //      -1  + 0   *  -1
        //      -1  + 0
        // int d =     -1

        System.out.println("c: " + c);
        System.out.println("d: " + d);

        System.out.println();

        int t = 100; // t= 100 | 101 | 100 | 101 | 100
        int p = - ++t * -t-- / t++ + --t;
        //   - 101 * - 101 / 100 + 100
        //    10201 / 100 + 100
        //    102 + 100
        //    202

        System.out.println("t: " + t);
        System.out.println("p: " + p);

        System.out.println();
        int R = 20; // R = 20 | 19 | 20 | 19 | 18
        int W = -R-- + -R++ + --R * R-- % 2;
        //      - 20 + - 19 + 19 * 19 % 2
        //      - 20 - 19 + 19 * 19 % 2
        //      - 20 - 19 + 361 % 2 -> 361 / 2 -> 180 * 2 = 360 | 361 - 360 = 1
        //      - 20 - 19 + 1
        //      -39 + 1
        //      -38

        System.out.println("R: " + R);
        System.out.println("W: " + W);

        //come back 8:15 est


    }
}
