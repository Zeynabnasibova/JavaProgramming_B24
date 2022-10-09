package SamePdfTask.Operators_Practice;

public class incrdecr5 {
    public static void main(String[] args) {
         /*
         int R = 20;
         int W = -R-- + -R++ + --R * R-- % 2;
         what is R?
         what is W?
          */
        int R = 20;//19;     20;     19; 18
        int W =      -R-- + -R++ + --R * R-- % 2;
        /*
                     -20 + -  19 +   19 * 19 % 2  ;
                     -20 - 19 + 19 * 19 % 2
                      -39 + 361 % 2
                             (360 / 2  = 180)bilo 361 ostatok 1
                     -39+1
                     -38
         */
        System.out.println(R);
        System.out.println(W);
    }
}
