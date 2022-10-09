package SamePdfTask.Variables_Datatype_Practice;

public class CarDriverInfo {
    /*
    add new class CarDriverInfo
    add main method
    carModel    -> ReplitTask.String
    driverName  -> ReplitTask.String
    licenseNum  -> ReplitTask.String
    speed       -> short
    isAutomatic -> boolean
    licenseClass-> char
     */
    public static void main(String[] args) {

        String carModel = "Kia\n",
                driverName = "Zeynab\n",
                lecenseNum = "12457888\n";
        short speed = 120;
        boolean isAutomatic = true;
        char licenseClass = 'A';

        System.out.println("Car Driver Info: \n" + "car model: " + carModel + "Driver name: " + driverName + "Lesense Num: " + lecenseNum + "Speed: " + speed + "\nAutomatic: " + isAutomatic + "\nLicense Class: " + licenseClass);


    }
}
