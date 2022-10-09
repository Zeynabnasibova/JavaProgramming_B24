package day55_abstraction.exerise;

public class Squatting extends Lifting{

    @Override
    public void perform() {
        System.out.println("Squatting...");
    }

    @Override
    public void getCalloriesBurned(int minutes) {
        System.out.println(minutes * 0.35);
    }

    @Override
    public void rackWeights() {
        System.out.println("Putting away the weights");

    }
}
