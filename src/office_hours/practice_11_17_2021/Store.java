package office_hours.practice_11_17_2021;

public class Store {

    public static void main(String[] args) {

        //All possible references of a TSHIrt object

        TShirt shirt1 = new TShirt();
        shirt1.wear();

        Clothes shirt2 = new TShirt();
        shirt2.wear();

        Object shirt3 = new TShirt();
        //shirt3.wear(); invalid because Object class does not have wear method
    }
}
