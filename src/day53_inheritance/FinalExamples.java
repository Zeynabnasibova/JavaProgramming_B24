package day53_inheritance;

public final class FinalExamples {

    final int a;
    public static final String PLANET = "Earth";

    public FinalExamples(int a){
        this.a = a;
    }

    public static void main(String[] args) {
        FinalExamples obj = new FinalExamples(5);
        System.out.println(obj.a);
        // obj.a = 10; a is final so we cannot change the value
        // PLANET = "Mars"; cannot reassign to final variables
    }


}