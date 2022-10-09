package Practice;

public class FrequencyOfChars {

    public static void main(String[] args) {

        /*
        Write a return method that can find the frequency of characters Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */

        System.out.println(frequencyOfChars("AAABBCDD"));

    }
    public static String frequencyOfChars(String str){

        String characters = "";

        for(int i = 0; i < str.length(); i++){

            if(!characters.contains("" + str.charAt(i))){

                characters += "" + str.charAt(i);
            }
        }

        String result = "";

        for(int i = 0; i < characters.length(); i++ ){

            int count = 0;

            for(int j = 0; j < str.length(); j++){

                if(str.charAt(j) == characters.charAt(i)) {

                    count++;
                }
            }
            result += characters.charAt(i) + "" + count;
        }

        return result;

    }


}
