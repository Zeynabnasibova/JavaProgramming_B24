package tutorialkart.Arrays.JavaArrayOfIntegers;

public class iterateoverarrayelements {

    public static void main(String[] args) {

        //We can use any of these looping statements like For Loop or While Loop to iterate over elements of a Java Array
        int numbers[] = {2, 1, 7, 6, 4, 2, 9};

        int index = 0;

        while (index < numbers.length) {

            System.out.println(numbers[index]);

            index++;

    }
        //terate over elements of Integer Array using Java For Loop

            System.out.println();

            int numbers1[] = {2, 1, 7, 6, 4, 2, 9};

            for (int index1 = 0; index1 < numbers1.length; index1++) {

                System.out.println(numbers1[index1]);

        }
            //Java for-each loop, to iterate over elements of integer array. For each loop can be used to execute a set of statements for each string in integer array.

        int numbers3[] = {2, 1, 7, 6, 4, 2, 9};

        for (int number3: numbers3) {

            System.out.println(number3);

        }

    }
}
