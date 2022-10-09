package ReplitTask.Loops;
import java.util.Scanner;
public class UtopianTree {

    public static void main(String[] args) {
/*
The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year. Show 10 years of growth of the Utopian Tree.

Output:

year 1 - growth 1 cm
tree size: 1cm

year 2 - growth 1 cm
tree size: 2cm

year 3  - growth 1 cm
tree size:3cm

year 4 - growth 2 cm
tree size: 5cm

year 5 - growth 2 cm
tree size: 7cm

year 6 - growth 2 cm
tree size: 9cm

... until you reach year 10
 */
        String UtopianTree = " ";
        int firstThreeYearSize = 1;
        int everyYear = 2;
        int growth = 0;
        int treeSize = 0;

for( int year = 0; year < 10; year++){
    if(year > 0 && year  < 3) {
        growth = 1;
        treeSize = year + growth;

    }else{
        growth = 2;
        treeSize = (year-3) * growth + 3;
    }

    System.out.println ("year " + year + " - growth " + growth + " cm" );
    System.out.println ("tree size: " + treeSize + "cm");
}

    }
}
