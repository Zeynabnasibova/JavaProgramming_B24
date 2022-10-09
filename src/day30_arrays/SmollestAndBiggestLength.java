package day30_arrays;

public class SmollestAndBiggestLength {

    public static void main(String[] args) {

            String[] countries = {
                "Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Turkey",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};

        String largestCountry = countries[0];
        String smallestCountry = countries[0];
        for(int i = 0; i < countries.length; i++){
            String eachCountry = countries[i];


            if (eachCountry.length() > largestCountry.length()){
                largestCountry = eachCountry;
            }if (eachCountry.length() < smallestCountry.length()){
                smallestCountry = eachCountry;
            }
            }
        System.out.println(largestCountry);
        System.out.println(smallestCountry);
        }
    }

