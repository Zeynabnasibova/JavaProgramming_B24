package day45_constructors;

public class UsingStdutent {

    public static void main(String[] args) {


        Student studentOne = new Student();
        studentOne.name = "James Bond";
        studentOne.batchNumber = 7;
        studentOne.grade = 90;


        System.out.println(studentOne.toString());// we try to call toString, but we dont't need to

        System.out.println();

        System.out.println(studentOne);// toString is still called

    }
}
