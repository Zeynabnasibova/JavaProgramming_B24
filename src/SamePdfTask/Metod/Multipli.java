package SamePdfTask.Metod;

public class Multipli {

    public static void main(String[] args) {

        int [] n = {2,3,4,5};

        multiple(n);

    }

    public static void multiple(int [] n){
        int multNum = 1;

        for(int i = 0 ; i < n.length ;i++){

            multNum *= n[i];

//        int multNum = 1;
//
//        for(int eachNum : n ){
//
//            multNum *= eachNum;
//

        }
        System.out.println(multNum);

    }
}
