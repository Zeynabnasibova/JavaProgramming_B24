package w3resource.com.Method;

public class Q7 {
/*
Write a Java method to display the first 50 pentagonal numbers.
Note: A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon, but, unlike the first two, the patterns involved in the construction of pentagonal numbers are not rotationally symmetrical.
Expected Output:

1     5     12    22    35    51    70    92    117   145
176   210   247   287   330   376   425   477   532   590
651   715   782   852   925   1001  1080  1162  1247  1335
1426  1520  1617  1717  1820  1926  2035  2147  2262  2380
2501  2625  2752  2882  3015  3151  3290  3432  3577
 */
    public static void main(String[] args) {

pentagonNums(50);
    }

public static int pentagonNums(int numOfPent){
    int number = 1;
    int increase = 4;

    System.out.print(number+" ");
    for (int i = 0; i < numOfPent-1; i++) {
        System.out.print(number+increase+ " ");
        number+=increase;
        increase+=3;
    }
    return number + increase;
}

}
