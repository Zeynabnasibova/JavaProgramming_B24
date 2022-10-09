package codingbat.Warmup1;

public class delDel {

    public static void main(String[] args) {


        /*
        Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"


         */

        System.out.println(delDel("adelbv"));

    }
    public static String delDel(String str) {
        if(str.length()<=3){

            return str;

        }else if(str.substring(1,4).contains("del")){

            return str.substring(0,1) + str.substring(4);

        }else{

            return str;

        }

    }

}
