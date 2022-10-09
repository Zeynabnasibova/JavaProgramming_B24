package SamePdfTask.Operators_Practice;

public class incrdecr2 {
    public static void main(String[] args) {
        /*
        Evaluate the expressions step by step.
        int a = 1
        int b = -a-- + a++ / -a-- * --a;
        what is a?what is b?
         */

        int a = 1;//0;      1; /  0;    -1
        int b =     -a-- + a++ / -a-- * --a; //(return value)
                  /* -1-- + a++ / -a-- * --a
                     -0   +  0  /  -0   *  -1
                     -1

                 */

        System.out.println(a);
        System.out.println(b);

    }
}
