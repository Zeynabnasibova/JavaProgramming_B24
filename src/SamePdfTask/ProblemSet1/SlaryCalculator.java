package SamePdfTask.ProblemSet1;
import java.util.Scanner;
public class SlaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Given the following information: hourly rate, weekly hours, and number of weeks. Checkif all the inputs are valid and then calculate the salary.
         -hourly rate cannot be negative or zero
         -> If invalid print: Hourly Rate cannot be Negative or Zero
         -weekly hours cannot be zero, negative or more than 65
         -> If invalid print: Weekly Hours cannot be less than 1 or greater than 65
         -number of weeks cannot be less than 1 and more than 52
         -> If invalid print: Number of weeks cannot be less than 1 or greater than 52
         Equation: salary  =  hourly rate *  weekly hours * number of weeks
         */

        int hourlyRate,weeklyHours,numberOfWeeks,salary;

        System.out.println("Input your hourly rate");
        hourlyRate = input.nextInt();

        if(hourlyRate >0){

        }else{
            System.out.println("Hourly Rate cannot be Negative or Zero");
        }

        System.out.println("Input your wekly hours");
        weeklyHours = input.nextInt();

        if(weeklyHours>=1 && weeklyHours<=65){

        }else{
            System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
        }

        System.out.println("Input your numbers of weeks");
        numberOfWeeks = input.nextInt();

        if(numberOfWeeks>=1 && numberOfWeeks<=52){

        }else{
            System.out.println("Number of weeks cannot be less than 1 or greater than 52");
        }
        salary = hourlyRate * weeklyHours * numberOfWeeks;
        System.out.println("Equation: salary  = " +salary + "$");
    }
}
