package day42_arraylist;
import java.util.Arrays;
import java.util.ArrayList;

public class ConvertArrayToList {

    public static void main(String[] args) {
        Integer [] a = { 1, 2, 3 }; // this needs to be Integer wrapper class because primitives types dont work

        Arrays.asList(a); // this allows us to convert from the array to the arraylist

        // converting the 'a' array to ArrayList
        ArrayList<Integer> list = new ArrayList<>( Arrays.asList(a) );
        System.out.println(list);


        // creating an array with values right away
        ArrayList<Integer> list2 = new ArrayList<>( Arrays.asList(4, 6, 1, 6, 10, 102, 50, 50, 20, 40) );
        System.out.println(list2.isEmpty());
        System.out.println(list2);


    }
}
