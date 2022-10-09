package day39_wrapper_arraylist;

public class WrapperExample1 {

    public static void main(String[] args) {

        int a = 5;

        //you cannnot use metod from it. a.methot()
        //you can: print, assign/reassing, calculations, casting

        Integer i1 = new  Integer(10);
        Integer i11 = new  Integer(i1);
        Integer i2 = 100;//this converts ints primitive to Integer wrapper class

        System.out.println(i1);
        System.out.println(i11);
        System.out.println(i2);


        byte b = 4;
        Byte b2 = new Byte((byte)5);
        Byte b3 = 5;
        Byte b4 = (byte)500;
        System.out.println(b4);

        System.out.println();

        short s = 100;
        Short s2 = new Short((short)200);
        Short s3 = 200;

        System.out.println();

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);


        long l = 1000l;
        Long l2 = new Long(2000l);
        Long l3 = 2000l;

        Float f1 = new Float(4.5);
        Float f2 = 4.5f;



    }
}
