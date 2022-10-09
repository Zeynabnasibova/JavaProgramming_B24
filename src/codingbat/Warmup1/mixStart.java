package codingbat.Warmup1;

public class mixStart {
/*

Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false

 */
public static void main(String[] args) {

    mixStart("mix snacks");

}


public static boolean mixStart(String str){

    if(str.startsWith("mix") || str.substring(1,3).startsWith("ix")) {

        System.out.println(true);

        return true;

    }else{

        System.out.println(false);

        return false;

    }

  }

}
