package day29_array;

public class SumOfNumbers {

    public static void main(String[] args) {
// manual way
        int [] numbers = {4, 1, 4};

        int sum = 0;

        sum += numbers[0];  // sum = sum + number[0]
        sum += numbers[1];
        sum += numbers[2];

        System.out.println(sum);

        // sum with loop
        System.out.println();

        int [] numberTwo = {5, 5, 2, 5, 1};
        int sumWithLoop = 0;

        for(int i = 0; i < numberTwo.length; i++){ // i <= numberTwo.length - 1
            System.out.println(numberTwo[i]);
           sumWithLoop += numberTwo[i];
        }
        System.out.println(sumWithLoop);

    }
}
