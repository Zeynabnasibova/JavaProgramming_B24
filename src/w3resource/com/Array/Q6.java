package w3resource.com.Array;

public class Q6 {
    public static void main(String[] args) {

        /*
         Write a Java program to find the index of an array element.
         */
        int [] number = {8, 5, 4, 7};

       index(number,5);


        }

        public static int index(int [] num, int index){


            for(int i = 0; i < num.length; i++){

                if(num[i] == index){

                    System.out.println(i);

                    return i;
                }


            }
            System.out.println(-1);
        return -1;
    }


}
