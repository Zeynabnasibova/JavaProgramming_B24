package SamePdfTask.Variables_Datatype_Practice;

public class Cinema {
    public static void main(String[] args) {

       /*
        - Print out the Movie information using concatenations and print statements
        ------ Welcome to the Cinema ------
        Tonight we are streaming "$movieName" which was released on $releaseDate
        This $genre movie got a $rottenTomatoesRating rating on Rotten Tomatoes.
        The rating is $rating and it runs for $duration hours.
        This is a sequel $isSequel and is on dvd $isOnDvd.
         */
        String movieName= "Titanic",
                genre= "Romance",
                release_date= "8\\"+4+"\\1997";
        int duration= 3,
                rotten_tomatoes_rating= 5;
        char rating = 'G';
        boolean sequels= false,
                dvd= true;
        System.out.print("---------------Welcome to the Cinema---------------\n" + "Tonight we are streaming " + movieName + " which was released on " + release_date + "\nThis " + genre + " movie got a " + rotten_tomatoes_rating + " rating on Rotten Tomatoes." + "\nThe rating is " + rating + " and it runs for "+duration+" hours." + "\nSequel: " + sequels + "\non dvd: " + dvd);
    }

}
