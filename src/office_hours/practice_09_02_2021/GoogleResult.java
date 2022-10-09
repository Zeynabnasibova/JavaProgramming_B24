package office_hours.practice_09_02_2021;

public class GoogleResult {

    public static void main(String[] args) {

        String s = "About 9,740,000,000 results (1.06 seconds)";

        int startOfResult = s.indexOf(" ") + 1;
        int endOfResult = s.indexOf(" result");

        System.out.println(s.substring(s.indexOf(" ")+1));

        System.out.println(s.substring(startOfResult,endOfResult));
        // System.out.println(s.substring(s.indexOf(" ")+1,s.indexOf(" results")));

        int secondsstart = s.indexOf("(")+1;
        int secondends  = s.indexOf(" seconds");

        System.out.println(s.substring(secondsstart,secondends));



    }
}
