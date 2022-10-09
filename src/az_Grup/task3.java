package az_Grup;

public class task3 {
    public static void main(String[] args) {
        /*

        A salesperson at a car dealership makes $200 commission per sale. If he hits 3 sales a day(hat-trick),he gets $300 bonus. If he hits more than 20 sales, his income is doubled.
Calculate his monthly income if he has one hat-trick. Use unary operators.
*/


        double sales = 25.5;
        int commission = 200;
        double totalIncome =sales*commission;

        System.out.println(totalIncome);
        totalIncome+=300;
        System.out.println("The income after the hat-trick is:"+totalIncome);
        totalIncome*=2;
        System.out.println("Since he has sold more than 20 cars, his final income will be"+totalIncome);
    }
}
