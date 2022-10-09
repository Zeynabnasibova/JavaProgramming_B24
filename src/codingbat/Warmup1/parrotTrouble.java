package codingbat.Warmup1;

public class parrotTrouble {

    public static void main(String[] args) {
/*
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.


parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
 */

parrotTrouble(true,6);


    }


    public static boolean parrotTrouble(boolean talking, int hour) {


        if(hour < 7 && talking == true || hour > 20 && talking == true){
            System.out.println(true);
            return true;

        }else if (hour < 7 && talking == false || hour > 20 && talking == false){
            System.out.println(false);
            return false;

        }else{

            System.out.println(false);
            return false;
        }
        }



}
