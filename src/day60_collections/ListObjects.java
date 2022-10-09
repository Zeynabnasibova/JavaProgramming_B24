package day60_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ListObjects {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add(null);
        System.out.println(list);
        System.out.println(list.get(2));


        List<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("c");
        linked.add(null);
        System.out.println(linked);
        System.out.println(linked.get(2));
        ( (LinkedList)linked).addFirst("hello");
        System.out.println(linked);
        
        HashSet<String>set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("c");
        set.add(null);
        System.out.println(set);
        //set.get(0);

        for(String each : set){
            System.out.println(each);
        }
         HashSet<String> set2 = new HashSet<>(list); // converts the list to set
        System.out.println(set2);

    }
}
