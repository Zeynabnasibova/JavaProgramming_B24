package az_Grup;

public class task1 {

    public static void main(String[] args) {


        int a = 5; // 6       7        8         9          8         7         6       7     8   9
        int b = 8; //                                                                      7
        int c =      ++a   +  ++a   -   a++   +  a++  -    --a   +   --a   -   a--    +    b--   /2   +  24 % 2  - 25 % 2 - 27 % 2   +   29 % 3;
        //             6   +   7   -    7     +  8     -    8   +     7     -    7    +    8   /2    +   0       - 1     -   1        +   2
        //               6 + 4 = 10

        int d =      ++a; // 7
        int e =        ++a  % 2  +   1 % 2 * 3 ; // 1 * 2 % 3 = 1
        //               8%2   + 1* 3 = 3


        int f =       ++a % 2  + 3 * 1 % 2 ;
                      //9 % 2  + 3 %2 =1 + 1 = 2


        int j =       4  * 1 / 4 * 2 % 2;
                  //     0

        int h =     4 / 4 % 1 * 2;
        //     0

        int g = 12%2;  //0

        System.out.println(a); //  9 ;
        System.out.println(b); //  7 ;
        System.out.println(c); //  10
        System.out.println(d); // 7
        System.out.println(e); // 3
        System.out.println(f); // 2
        System.out.println(j); // 0
        System.out.println(h); // 0
        System.out.println(g); // 0

        // 10 : 23

    }
}




























//  ! -->   &&  --> ||