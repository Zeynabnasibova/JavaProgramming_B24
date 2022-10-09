package murodillT.Arrays;

public class ArraysCrearion {

    public static void main(String[] args) {
//      declare array that can hold 5 items
        int [] numbers = new int [5];
        //asign
        //0,1,2,3,4
        numbers[0] = 234;
        numbers[1] = 432;
        numbers[2] = 100;
        numbers[3] = 54;
        numbers[4] = 7654;
        System.out.println(numbers[0]);

        numbers[1] = numbers[2] + numbers[3];
        System.out.println(numbers[1]);

    }

}
