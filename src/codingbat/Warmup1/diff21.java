package codingbat.Warmup1;

public class diff21 {

    /*
    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
     */
    public static void main(String[] args) {

        diff21(2);

    }

    public static int diff21(int n) {


        if (n > 21) {
            System.out.println((n - 21) * 2);
            return (n - 21) * 2;

        } else {
            System.out.println(21 - n);
            return 21 - n;

        }

    }
}