package SamePdfTask.Operators_Practice;

public class incrdecr6 {
    public static void main(String[] args) {
             /*
             int M = 300;
             int N = 400;
             int U = ++M + N++ - M-- % 2 + --N % 2;
             what is M?
             what is N?
             what is U
              */
        int M = 300;//301;        300
        int N = 400;//      401;            400
        int U =       ++M + N++ - M-- % 2 + --N % 2;
        /*
                       301 + 400 - 301 % 2 + 400 % 2 --> esli ostatok netu to zero 400/2
                        701 - 1 + 0
                        700
         */

        System.out.println(M);
        System.out.println(N);
        System.out.println(U);;

    }
}
