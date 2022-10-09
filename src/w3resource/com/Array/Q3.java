package w3resource.com.Array;

public class Q3 {

    public static void main(String[] args) {

        /*
        Write a Java program to print the following grid. Go to the editor

Expected Output :

- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
         */

        String [] vertical = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
        String [] gorizontal ={"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};


//        int [] [] num = new int [10][10];

        for(int i = 0; i < 10; i++){
            System.out.println(vertical[i]);

            for(int j = 0; j < 10; j++){

                System.out.print(gorizontal[j]);
            }
        }


        
    }
}
