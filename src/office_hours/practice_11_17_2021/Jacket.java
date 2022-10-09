package office_hours.practice_11_17_2021;

public class Jacket extends Clothes implements HasHood{

    @Override
    public void wear() {
        System.out.println("putting on jacket");
        putOnHood();
    }

    @Override
    public void putOnHood() {
        System.out.println("Puttng on hood");

    }
}
