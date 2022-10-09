package day50_inheritance;

public class Airport {

    public static void main(String[] args) {

    FlightTicket ticket = new FlightTicket("privet jet", "NewYork", "Florida");

    /*
    ticket.type;
    ticket.depertureLocation;
    ticket.arrivalLocation;
    */


        System.out.println(ticket.getType());
        System.out.println(ticket.getDepertureLocation());
        System.out.println(ticket.getArrivalLocation());


}
}