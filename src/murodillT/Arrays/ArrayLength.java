package murodillT.Arrays;

public class ArrayLength {

    public static void main(String[] args) {

        // declare array names that store 5 names

        String[] names = new String[5];
        names[0] = "Serik";
        names[1] = "Khalili";
        names[2] = "Z";
        names[3] = "Erkam";
        names[4] = "Zarina";

        System.out.println(names.length);//cout of values in array

        //String name and assign Khalili to it by reading from array
        String name = names[1];
// count of characters of length
        System.out.println(name.length());//7

        System.out.println(names[1].length());//7




    }
}
