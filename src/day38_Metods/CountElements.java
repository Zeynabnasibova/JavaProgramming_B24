package day38_Metods;

public class CountElements {

    /*
      Create a method that accepts an int array and a number

      count and return the number of times the given number is found in the array

      return type: int
      method name: frequencyOfElement
      parameters: int [], int

      Ex: Input:
              {1, 2, 5, 1, 4, 1}, 1
          Output:
              3
       */
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 1, 4, 1};

        System.out.println(frequencyElement(arr, 1));
        System.out.println(frequencyElement(arr, 5));
        System.out.println(frequencyElement(arr, 4));


        System.out.println();


        getUniqueElements(arr);
    }

    public static int frequencyElement(int[] nums, int element) {

        int counter = 0;

        for (int each : nums) {
            if (each == element) {
                counter++;

            }
        }
        return  counter;
    }
    /*

    Given a int array, find and print all of the unique elements

     */

    public static void getUniqueElements(int [] nums){

        for(int each : nums){

            int counter = frequencyElement(nums, each);

            if(counter == 1){
                System.out.println(each);
            }
        }
    }


}

