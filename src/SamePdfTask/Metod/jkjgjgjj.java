package SamePdfTask.Metod;

public class jkjgjgjj {

    public static void main(String[] args) {

int [] nums = {1,2,3,4};

        int countEven = 0;
        int countOdd = 0;

        for ( int i = 0; i < nums.length; i++){

            if(nums [i] % 2 == 0){
                countEven++;
            }else if(nums [i] % 2 ==1){
                countOdd++;

            }
        }
        System.out.println(countEven);
        System.out.println(countOdd);

    }
}
