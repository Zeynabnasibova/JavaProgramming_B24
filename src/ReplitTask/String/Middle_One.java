package ReplitTask.String;
import java.util.Scanner;
public class Middle_One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        You have a word, do the following:
     1. When word has odd number of characters and:
        3 or more characters,print middle letter
        Single character,print that character 3 times
     2.When word has even number of characters and:
        4 or more characters,print middle 2
        2 characters,print those 2 characters twice
         */


        System.out.println("Enter your word");
        String word = input.nextLine();

        int charCount = word.length();

        //int middleIndex = charCount/2;
        if(charCount%2 != 0 && charCount >= 3) {
            System.out.println(word.charAt(word.length()/2));
        }else if(charCount == 1 ){
            System.out.println(word + word + word);
        }
        if(charCount %2 == 0 && charCount >= 4){
            System.out.println(word.charAt(word.length()/2) + "" + word.charAt(word.length()/2 -1));
        }else if(charCount==2){
            System.out.println(word + word);
        }

/*
if(word.length()%2!=0 &&  word.length()>=3){
      System.out.println(word.charAt(word.length()/2));

    }else if(word.length()==1){
      System.out.println(word+word+word);

    }if(word.length()%2==0 && word.length()>=4){
      System.out.println(word.charAt(word.length()/2-1) + "" + word.charAt(word.length()/2));

    }else if(word.length()==2){
      System.out.println(word+word);

    }
 */



        }
    }
