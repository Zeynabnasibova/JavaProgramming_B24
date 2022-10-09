package SamePdfTask.ProblemSet1;
import java.util.Scanner;
public class QualificationForArmy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
[Qualification For Army]
Given information: Citizenship(ReplitTask.String), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.
-The person must be a Citizen of the USA or a resident
-> If not print: You must be a U.S. citizen or a resident
-Their age must be between 18 and 35
-> If not print: Your age must be between 18 to 35 years old
-They must have a high school diploma
-> If not print: You must have a high school diploma
> If all the criteria is met print: You are qualified for the US Army

         */
        String citizenship;
        boolean resident;
        boolean hashighSchoolDiploma;
        int age;


        System.out.println("Qualification For Army");
        System.out.println("Input your citizenship");
        citizenship = input.nextLine();
        System.out.println("Are you a resident?");
        resident = input.nextBoolean();
        if (citizenship.equalsIgnoreCase("us") || resident == true) {

            System.out.println("Input  your age");
            age = input.nextInt();
            if (age >= 18 && age <= 35) {

                System.out.println("Has highSchool diploma");
                hashighSchoolDiploma = input.nextBoolean();
                if (hashighSchoolDiploma == true) {

                    System.out.println("You are qualified for the US Army");
                } else {
                    System.out.println("You must have a high school diploma");
                }

            }else {
                System.out.println("age must be between 18 and 35");
            }
        }else{
            System.out.println("You must be a U.S. citizen or a resident");


        }
            }
        }
/*
System.out.println("Are you a Citizen?");
        ReplitTask.String citizenship = input.next();
        boolean isCitizen = (citizenship.equals("yes")) ? true : false;

        if (!isCitizen) {
            System.out.println("Are you a green card holder?");
            ReplitTask.String resident = input.next();
            boolean isResident = (resident.equals("yes")) ? true : false;
            if (!isResident) {
                System.out.println("You must be a U.S. citizen or a resident");

            } else if (isCitizen || isResident) {

                System.out.println("What is your age?");
                int age = input.nextInt();
                if (age < 18 && age > 35) {
                    System.out.println("Your age must be between 18 to 35 years old");
                } else if (age >= 18 && age <= 35) {

                    System.out.println("Do you have a high school diploma?");
                    ReplitTask.String diploma = input.next();
                    boolean hasDiploma = (diploma.equals("yes")) ? true : false;
                    if (hasDiploma) {
                        System.out.println("You are qualified for the US Army");
                    } else if (!hasDiploma) {
                        System.out.println("You must have a high school diploma");
                    }
 */