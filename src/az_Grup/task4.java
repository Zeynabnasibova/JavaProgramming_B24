package az_Grup;

public class task4 {
    public static void main(String[] args) {
        //swap two number:int a =35;int b=20;

        int a = 35;
        int b = 20;
        b = (a + b) - (a = b);
        System.out.println("a " + a + "," + "b " + b);

        int apples = 50;
        int orange = 25;
        orange = (apples + orange) - (apples = orange);

        System.out.println("apples: " + apples + "\n" + "orange: " + orange);



    }
}
