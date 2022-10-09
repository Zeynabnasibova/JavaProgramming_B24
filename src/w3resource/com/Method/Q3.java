package w3resource.com.Method;

public class Q3 {

/*
Write a Java method to display the middle character of a string.
Note: a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.
Test Data:
Input a string: 350
The middle character in the string: 5
Expected Output:
 *///Zeyneb Leyla
    public static String middle(String str){

        if(str.length()%2 == 1) {
String oddMiddle = "";
      oddMiddle = str.substring(str.length()/2,str.length()/2+1);
            System.out.println(oddMiddle);
      return str;

        } else if(str.length() % 2 == 0){
String evenMiddle = "";
           evenMiddle = str.substring(str.length()/2-1,str.length()/2+1);
            System.out.println(evenMiddle);
            return evenMiddle;

        }else {
            System.out.println("Invalid");
          return "Invalid";

        }

    }

    public static void main(String[] args) {

middle("350");
    }

}
