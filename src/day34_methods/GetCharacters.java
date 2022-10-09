package day34_methods;

public class GetCharacters {

    /*

    Print each one in one line

    - make method that will print all the letters from A to Z

    - make method that will print all the letters from a to z

    - make method that will print all the letters from Z to A

    - make method that will print all the letters from z to a

    - make method that will print all the letters from 0 to 9


     */
    public static void main(String[] args) {
        allLetterAtoZ();
        allLetteratoz();
        allLetterZtoA();
        allLetterztoa();
        allLetter0to9();
    }

    public static void allLetterAtoZ(){
        System.out.println("letters from A to Z");
        String count = " ";
        for(char ch = 'A';ch <= 'Z';ch++){
            count += ch + " ";
        }
        System.out.println(count);
    }

    public static void allLetteratoz(){

        System.out.println("letters from a to z");
        String count = " ";
        for(char ch = 'a';ch <= 'z';ch++){
            count += ch + " ";
        }
        System.out.println(count);
    }

    public static void allLetterZtoA(){
        System.out.println("letters from Z to A");
        String count = " ";
        for(char ch = 'Z';ch >= 'A';ch--){
            count += ch + " ";
        }
        System.out.println(count);

    }
    public static  void allLetterztoa(){
        System.out.println("letters from z to a");
        String count = " ";
        for(char ch = 'z';ch >='a';ch--){
            count += ch + " ";
        }
        System.out.println(count);

    }

    public static void allLetter0to9(){
        System.out.println("number from 0 to 9");
        String count = " ";
        for(char ch = '0';ch <='9';ch++){
            count += ch + " ";
        }
        System.out.println(count);

    }

}
