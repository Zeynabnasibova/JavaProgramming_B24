package codingbat.Warmup1;

public class stringE {
    /*

    Return true if the given string contains between 1 and 3 'e' chars.


    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false

     */
    public static void main(String[] args) {

        stringE("hello");

    }


    public static boolean stringE(String str) {




        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'e') {

                count++;
            }
            // alternately: str.substring(i, i+1).equals("e")

        }

        return (count >= 1 && count <= 3);


    }


}
