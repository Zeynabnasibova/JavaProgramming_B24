package w3resource.com.Array;

public class Q5 {
    public static boolean contain(int [] num, int value) {
        /*
        Write a Java program to test if an array contains a specific value.

         */

//boolean  bl = true;

for(int eachNum : num){
    if(eachNum == value ){
        System.out.println(true);
      return true;
    }
}
        System.out.println(false);
      return false;
    }

    public static void main(String[] args) {

          int [] number = new int []{1,2,3,4};

          contain(number,1);
    }

}
