package az_Grup;

public class task2 {
    public static void main(String[] args) {
        /*
         int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7;

        System.out.println(++a * b / 2  >  c  &&  true != (false  || d-- + g % 2 < e * f--));
         */

        int a = 1; //2
        int b = 2;
        int c = 3;
        int d = 4;//3
        int e = 5;
        int f = 6;//5
        int g = 7;
        System.out.println(++a * b / 2  >  c  &&  true != (false  || d-- + g % 2 < e * f--));

        // 2 * 1 > 3 && true       //4 +1 < 30= 5 < 30 //FALSE
        //false && true  != (false || 4 + 7%2 < 5 * 6)
        // false  TRUE
    }
}
