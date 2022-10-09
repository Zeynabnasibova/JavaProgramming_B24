package office_hours.practice_09_08_2021;
import java.util.Arrays;
public class WebsiteCheker {

    public static void main(String[] args) {
/*
Website checker
Given some urls determine how many .com, .org, and .edu websites there are. Also keep track of an ‘other’ category for websites that have a different domain
Sample websites for an array:
bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com, nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com, comcast.net, tamu.edu, utexas.edu,
 */

        String [] websites = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"};

        int com = 0, org = 0 , edu = 0, other = 0;

        /*
        [ com, org, edu, other ]

         */

        int [] counter = new int [4];

        for(String eachSite : websites){ // eachSite == websites[i];

            if(eachSite.endsWith(".com")){  //if(websites[i].ensWhith(.com));
                com++;
                counter[0]++;
            } else if(eachSite.endsWith(".org")){
                org++;
                counter[1]++;
            } else if(eachSite.endsWith(".edu")){
                edu++;
                counter[2]++;
            } else{
               other++;
                counter[3]++;
            }

        }
        System.out.println(".com: " + com);
        System.out.println(".org: " + org);
        System.out.println(".edu: " + edu);
        System.out.println(".other: " + other);

        System.out.println(".com: " + counter[0]);
        System.out.println(".org: " + counter[1]);
        System.out.println(".edu: " + counter[2]);
        System.out.println(".other: " + counter[3]);

        System.out.println(Arrays.toString(counter));







    }
}
