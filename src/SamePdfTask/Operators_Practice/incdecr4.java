package SamePdfTask.Operators_Practice;

public class incdecr4 {
    public static void main(String[] args) {
  /*
        int X = 4;
        int Y = X * 4 - X++;
        what is X?what is Y?
   */
        int X = 4;//4;      5
        int Y =     X * 4 - X++;
        /*          4 * 4 - 4
                     16 - 4
                       12
         */

        System.out.println(X);
        System.out.println(Y);

        /*
        int t = 100;
        int p = - ++t * -t-- / t++ + --t;
        what is t?what is p?
         */
        int t = 100;//101;   100;   101;  100
        int p =      - ++t * -t-- / t++ + --t;
        /*
                      - 101 * -101 / 100 + 100
                          10201 /  100 + 100
                          202.01

         */

        System.out.println(t);
        System.out.println(p);

    }
}