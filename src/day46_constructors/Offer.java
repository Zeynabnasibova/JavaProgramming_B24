package day46_constructors;

public class Offer {

    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    public Offer(String location, String company, double salary, boolean isFullTime, int mumberOfPTO){

        this.location = location;// "this" is refers to instance variables // . mean location //= asign //
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = mumberOfPTO;



    }

    @Override// override this keyword to refer curent class instance variables
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberOfPTO=" + numberOfPTO +
                '}';
    }

}
