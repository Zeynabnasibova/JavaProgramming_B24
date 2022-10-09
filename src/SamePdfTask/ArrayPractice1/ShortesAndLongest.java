package SamePdfTask.ArrayPractice1;

public class ShortesAndLongest {

    public static void main(String[] args) {

        /*
        Shortest and Longest words from String array
        •Write a program that can return the shortest string element from a String array
        •Write a program that can return the longest string element from a String array
         */

        String[] arr = {"Anar", "Zeyneb", "child"};


        String shortestWord = "";
        String longestWord = "";

        int longest = arr[0].length();
        int shortest = arr[0].length();


        for (int i = 0; i < arr.length; i++) {

            System.out.println( );

            if (arr[i].length() > longest) {

                longestWord = arr[i];



            } else if (arr[i].length() < shortest) {

                shortestWord = arr[i];


            }


        }

        System.out.println(shortest);
        System.out.println(longest);
        System.out.println("Shortest word: " + shortestWord);
        System.out.println("Longest word: " + longestWord);
    }
}