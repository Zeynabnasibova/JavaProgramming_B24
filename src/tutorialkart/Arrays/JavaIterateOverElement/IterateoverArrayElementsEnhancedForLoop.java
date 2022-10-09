package tutorialkart.Arrays.JavaIterateOverElement;

public class IterateoverArrayElementsEnhancedForLoop {

    public static void main(String[] args) {
        /*

        In this example, we are using enhanced for loop to iterate through array elements. The for loop is enhanced, because we do not initialize some index, nor update it, nor use the index to get the element from array. All of that is encapsulated in a single statement of int num:nums.
         */
/**
 * Java Example Program to iterate over Array Elements
 */

                int[] nums = {25, 86, 41, 97, 22, 34};
                for (int num : nums) {
                    //access each element
                    System.out.println(num);
                }
            }
        }