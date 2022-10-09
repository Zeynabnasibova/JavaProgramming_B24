package SamePdfTask.ProblemSet1;

import java.util.Scanner;
public class PersonalInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        ----------------------------------------------------------
        [Personal Information-Scanner and If]
        Ask the user how many people they live with?
        if user lives with Less than 2 people: print "Live with less than 2 people"
        if the user lives with 3 -6 people: print "Live with 3 -6 people"
        if the user lives with more than 6 people: print "Live with more than 6 people"
        Ask the user what city they live in?
        Ask the user if the live in downtown ("yes or no")
        if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
        if they have thought about it print "do it its great",
         if they have not print "You should think about it"
         Ask the user their favorite animal?
         Print "Wow %animal is a great animal"
         Ask the user how many pets they want?
         Print "Interesting, do you want %numberOfPets %favoriteAnimals?"
         */

        System.out.println("How many people they live with?");
        int people = input.nextInt();
        if (people <= 2 && people >=0) {
            System.out.println("Live with less than 2 people");

        } else if (people >= 3 && people <= 6) {
            System.out.println("Live with 3 -6 people");
        } else if (people > 6) {
            System.out.println("Live with more than 6 people");
        }
        System.out.println("What city you live in?");
        String cityName = input.next();
        System.out.println("Do you live in downtown?");
        String liveDowntown = input.next();
        if (liveDowntown.equals("yes")) {
            System.out.println("have you thought about moving to the suburbs?");
            String thoughtMoving = input.next();
            if(thoughtMoving.equals("yes")){
                System.out.println("do it its great");
            }else{
                System.out.println("You should think about it");
            }
            System.out.println("What is your favorite animals?");
            String favoriteAnimal = input.next();
            System.out.println("Wow " + favoriteAnimal + " is a great animal");
            System.out.println("How many pets you want? ");
            int numberOfPets = input.nextInt();
            System.out.println("Interesting, do you want " + numberOfPets + " " + favoriteAnimal + "?");

        }

    }
}
/*         if (liveDowntown.equalsIgnoreCase("yes")) {
            System.out.println("Have you thought about moving to the suburbs?");
            ReplitTask.String moveToSuburb = input.next();

            if (moveToSuburb.equalsIgnoreCase("yes")) {
                System.out.println("Do it, it's great");
            } else if (moveToSuburb.equalsIgnoreCase("no")) {
                System.out.println("You should think about it");
            }

            System.out.println(moveToSuburb.equalsIgnoreCase("yes")
                    ? "Do it, it's great" : "You should think about it");

        }

 */

