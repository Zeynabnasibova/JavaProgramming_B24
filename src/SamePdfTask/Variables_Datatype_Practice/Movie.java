package SamePdfTask.Variables_Datatype_Practice;

public class Movie {
    public static void main(String[] args) {

        /*
        Create a class Movie
        create a main method
        - Each the datatype you feel is most appropriate for each variable.
        - Create the following variables:
        name, genre, duration, release date, rating(G, PG, R, etc..), is a sequels or not, rotten tomatoes rating (out of 100), is on dvd.
         */
        String movieName= "Titanic",
              genre= "Romance",
                release_date= "12\\"+19+"\\1997";
        int duration= 3,
                rotten_tomatoes_rating= 5;
        char rating = 'G';
        boolean dvd= true,
                sequels= false;
        System.out.println("Welcom to the Cinema\n" + "Movie name: "+movieName + "\nGenre: " + genre + "\nduration: " +duration + " hours" + "\nrelease date: " + release_date + "\nrating: " + rating + "\nsequels: " + sequels + "\nrotten tomatoes rating: " + rotten_tomatoes_rating + "\ndvd: " + dvd);
    }
}
