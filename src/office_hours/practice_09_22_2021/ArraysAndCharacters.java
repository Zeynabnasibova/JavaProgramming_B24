package office_hours.practice_09_22_2021;

public class ArraysAndCharacters {

    /*
    loop, array, String
    method
    frequency of character
    Array of String
    find the frequency of a specific character
    { "apple", "ape", "java" }
    'a'
    -> 4
     */

    public static void main(String[] args) {

        String [] arr = {"apple", "ape", "java"};

        System.out.println(frequencyOfChar(arr, 'a'));
    }

    public static int frequencyOfChar(String [] words, char letter){

        int count = 0;

        for(String eachWord : words){

            //  char [] eachArr = eachWord.toCharArray();

            for(char eachLetter : eachWord.toCharArray()){ // : eachArr

                if(eachLetter == letter){
                    count++;
                }

            }

        }

        return count;
    }

}