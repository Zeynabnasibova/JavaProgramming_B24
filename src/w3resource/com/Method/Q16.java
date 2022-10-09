package w3resource.com.Method;

public class Q16 {

    public static void main(String[] args) {

        int num = 100;
        prime(num);

    }

    public static boolean prime(int num) {


        for (int i = 2; i <= num; i++) {

          int count = 0;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                  count++;
                }
            }
            if (count==0) {
                System.out.print(i + " ");
            }

        }
        return  true;
    }
}

