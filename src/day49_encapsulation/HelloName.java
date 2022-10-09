package day49_encapsulation;

public class HelloName {
    public static void main(String[] args) {

        /*
        if it is not static it means it is instance and to use anything that is instance you need an object first
you would need to make an object of HelloName name = new HelloName()
then you can use that object to call the method
name.helloName("james")
         */
        HelloName name = new HelloName();

      //  name.helloName("Zeynab");

        System.out.println(name.helloName("Zeynab"));


        HelloName name2 = new HelloName();
        System.out.println(name2.helloName("Leyla"));


    }


    public String helloName(String name) {

        name = "Hello ".concat(name) + "!" ;

        return name;


    }

}
