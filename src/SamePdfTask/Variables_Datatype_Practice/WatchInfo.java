package SamePdfTask.Variables_Datatype_Practice;

public class WatchInfo {

    /*
    Task
    Add a new class WatchInfo
    add main method
    brand, color, price, waterResistant, isSmart
     */
    public static void main(String[] args) {
        String watchInfo = "Watch Info:\n",
                brand = "Apple\n",
                 color = "white\n";
        int price = 100;
        boolean waterResistant = true,
                isSmart = true;
        System.out.println(watchInfo +  "brand: " + brand + "color: " +  color + "price: " + price + "$" + "\nwater resistant: " + waterResistant + "\nSmart: " + isSmart);

    }
}
