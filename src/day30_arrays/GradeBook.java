package day30_arrays;
import java.util.Scanner;
import java.util.Arrays;
public class GradeBook {

    public static void main(String[] args) {

       /*
            student array -> names of students
            grades values (double) -> grades of students
            [ james bond , ]
            [      80   ,
         */

        String [] studentNames = {"James Bond", "Jamie Fox", "Luke Smith"};
        double [] studentGrades = { 90, 80.5, 100};

        for(int i = 0; i < studentGrades.length; i++){

            System.out.println(studentNames[i] + " -> " + studentGrades[i]);

        }



    }
}
