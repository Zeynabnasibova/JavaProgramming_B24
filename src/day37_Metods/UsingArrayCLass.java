package day37_Metods;
import my_utilities.ArraysUtil;
public class UsingArrayCLass {
    public static void main(String[] args) {

        int [] a = {4,5,159,19,19,299};

        System.out.println(ArraysUtil.minNumber(a));
        System.out.println(ArraysUtil.maxNumber(a));


        System.out.println(ArraysUtil.contains(a, 5));
        System.out.println(ArraysUtil.contains(a, 50));

    }
}
