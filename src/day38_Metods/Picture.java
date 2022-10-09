package day38_Metods;

public class Picture {

    public static void main(String[] args) {

        draw(50);
        draw("Red");
        draw("blue","yellow");
    }

    public static void draw(String color1){
        System.out.println("Using 1 color: " + color1);
    }

    public static void draw(String color1, String color2){

        System.out.println("Using 2 colors: " + color1 + " " + color2 );

    }

    public static void draw(int size){
        System.out.println("Drawing " + size + " inches picture");

    }
}
