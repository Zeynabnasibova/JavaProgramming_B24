package w3resource.com.Method;

public class Pentagon {


    public static void main(String[] args) {

        pentagon(20);
        // 4 9 16 23
    }
    public static int pentagon(int numOfPent){

        int number = 4;
        int increment = 5;

        System.out.println(number + " ");

        for(int i = 0; i < numOfPent-1;i++){
            System.out.println(number + increment + " ");
            number += increment;
            increment += 2;
        }
        System.out.println( number + increment );
        return  number + increment;
    }
}
