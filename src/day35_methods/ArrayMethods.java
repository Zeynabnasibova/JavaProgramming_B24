package day35_methods;

public class ArrayMethods {

    /*

        make a method that accepts the array. Find and print the first element

        make a method that accepts the array. Find and print the last element

        make a method that accepts the array. Find and print the middle element

     */
    public static void main(String[] args) {

        int [] a = {50, 4, 100, 90, 31};



        getFirstArrayEllement(a);
        getLastArrayElement(a);
        getMiddlArrayElement(a);
    }

    public static void getFirstArrayEllement(int [] nums){
        System.out.println("First element: " + nums[0]);
    }
    public static void getLastArrayElement(int [] nums) {
        System.out.println("Last element: " + nums[nums.length-1]);
    }
    public static void getMiddlArrayElement(int [] nums){

        if(nums.length % 2 == 1){
            //odd length
            System.out.println("Middle element: " + nums[nums.length/2]);
        }else {
            //even number
            System.out.println("First middle element: " + nums[nums.length/2]);
            System.out.println("Second middle element: " + nums[nums.length/2]);
        }
    }
}
