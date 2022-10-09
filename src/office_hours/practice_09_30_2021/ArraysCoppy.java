package office_hours.practice_09_30_2021;

import java.util.Arrays;

public class ArraysCoppy {

    public static void main(String[] args) {

        int [] a = {1,2,3};
        System.out.println(Arrays.toString(a));

        int [] b = a;

        b[0] = 1000;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}