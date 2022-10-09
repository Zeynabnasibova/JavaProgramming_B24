package day50_inheritance;

public class FlightTicket {

    private String type;
    private String depertureLocation;
    private String arrivalLocation;

    public FlightTicket(String type, String depertureLocation, String arrivalLocation) {
       // this.type = type;
        setType(type);
        this.depertureLocation = depertureLocation;
        this.arrivalLocation = arrivalLocation;

    }




    public String getType() {
        return type;
    }

    public void setType(String type) {

        if(type.equals("first") || type.equals("business") || type.equals("economy"))
        this.type = type;
    }

    public String getDepertureLocation() {
        return depertureLocation;
    }

    public void setDepertureLocation(String depertureLocation) {
        this.depertureLocation = depertureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;

    }
}
