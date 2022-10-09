package day55_abstraction.exerise;

public class Running extends  Exercise{


    @Override
    public void perform() {

        System.out.println("Runnin...");

    }

    @Override
    public void getCalloriesBurned(int minutes) {

        System.out.println(minutes * 0.4);
    }
}
