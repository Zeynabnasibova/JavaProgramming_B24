package SamePdfTask.Variables_Datatype_Practice;

public class Employee {
    public static void main(String[] args) {

        /*
        Create a class Employee
        create a main method
        Declare and assign these variables according to the most appropriate datatypes: (Use as many datatypes as you can for practice)
        - first name, last name, company name, salary, start day, start month, start year, are they full time, job title, office address,
        Declare new variables and use concatenation from previous variables to set their values
        - full name (first and last name)
        - full start date (start month date, year)
        - email (first name + start day @ $company name .com)
        - Salary after 3 years (base salary + start month * 10000)
        Ex: base: 100000
        start day: 2
        after 3 year: (100000 + (2 * 1000)) = 102000
        Display the values of the variables following given example image
         */
        String firstName = "Zeynab",
                lastName = "Nasibova",
                companyName = "SpaseX",
                jobTitle = "Tester",
                officeAddress = "Orlando 123";

        short startDay = 2,
                startMonth =1;

        int startYear = 2022;

        boolean areTheyFullTime = true;

        double baseSalary =150_000, //$
                salaryAfter3Years = baseSalary +(2 *1000);

        /*Declare new variables and use concatenation from previous variables to set their values
        - full name (first and last name)
        - full start date (start month date, year)
        - email (first name + start day @ $company name .com)
         */
        String fullName = firstName + " " +lastName,
                fullStartDate = startMonth + "/"+startDay+"/"+startYear,
                email = firstName + startDay + "@"+companyName+".com";

        System.out.println("Employee Information: \n" + "Full name: "+fullName + "\nFull start date: "+fullStartDate +
                "\nE-mail: " + email + "\nSalary after 3 years: "+"$" + salaryAfter3Years);
    }
}
