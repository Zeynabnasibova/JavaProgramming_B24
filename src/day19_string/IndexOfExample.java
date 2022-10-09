package day19_string;

public class IndexOfExample {
    public static void main(String[] args) {

        // charAt -> takes a number(index) and gives back a char

        // indexOf -> takes a char/ReplitTask.String and gives back the position/index/number

        //          0123
        String s = "javava";
        System.out.println(s.indexOf('j')); // 0
        System.out.println(s.indexOf('a')); // 1
        System.out.println(s.indexOf('z')); // -1
        System.out.println(s.indexOf('v')); // 2

        System.out.println(s.indexOf("ja")); // 0
        System.out.println(s.indexOf("ava")); // 1
        System.out.println(s.indexOf("Va")); // -1
        System.out.println(s.indexOf("va")); // 2
    }
}
