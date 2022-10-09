package codingbat.Array_1;

public class commondEnd {

    /*
    Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.


commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
     */


    public static boolean commond(int [] a, int [] b){

       //for(int i = 0; i = )
      if(a[a.length-1]==b[b.length-1] || a[0] == b[0]){

          return true;

        }else{

          return false;
      }



    }

    public static void main(String[] args) {

        int [] a = new int [] {1, 2, 3};
        int [] b = new int [] {7, 3};

        System.out.println(commond(a,b));
    }

}
