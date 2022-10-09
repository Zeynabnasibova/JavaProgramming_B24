package SamePdfTask.Operators_Practice;

public class incrdecr3 {
    public static void main(String[] args) {
        /*
        Evaluate the expressions step by step.
        A = 50;
        int B = --A + A++ + A-- + A++;
        what is A?
        what is B?
         */
        int A = 50;//49;   50;   49;   50
        int B =      --A + A++ + A-- + A++;
        /*
                       49 + 49  + 50 +   49
                           197
         */

        System.out.println(A);
        System.out.println(B);

    }
}
