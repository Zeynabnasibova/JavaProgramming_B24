package az_Grup;

public class swapTonumbers {
    public static void main(String[] args) {

        int a, b;
        a = 15;
        b = 27;
        System.out.println("Befor swapping : a = " + a + " , b = " + b);
        a = a + b; // 15 + 27 = 42
        b = a - b;// 42 - 27  = 15
        a = a - b; // 42 - 15 = 27

        System.out.println("After swapping : a = " + a + ", b = " + b);

    }
}
