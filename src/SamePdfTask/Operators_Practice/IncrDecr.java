package SamePdfTask.Operators_Practice;

public class IncrDecr {
    public static void main(String[] args) {

        int n =0;
        n++;//n = 1
        System.out.println(n); //n = 1
        System.out.println(++n); // n = 2 and return new value 2

        System.out.println(n++); // n = 3 and return old value 2(is output)
        System.out.println();
        System.out.println(n); // n = 3

        System.out.println();

        int age = 10;
        System.out.println(age);//10
        System.out.println(age++);//11 and return old value (10(output)
        System.out.println(age);//11
        System.out.println(++age);//12 and return new value (12(output)
        System.out.println(age);//12
        System.out.println();

        System.out.println(age++ * 2); // 12++ *2 = 13*2 = 24;age = 13; return why 24?????
        System.out.println(age);// = 13

        System.out.println(++age + 2);//++13 + 2 = 16; age = 14
        System.out.println(age);
    }
}
