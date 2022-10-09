package SamePdfTask.Operators_Practice;

public class Pizza {
    /*
    add new class Pizza
add main method
	pizza = "cheese"
	pizza slices = 8
	people = 4
	calculate the slices per person
    Example output:
	We ordered cheese pizza with 8 slices, 4 people ate 2 slices each

     */
    public static void main(String[] args) {
        String pizza = "cheese";
        int pizzaSlices =8,
            people = 4,
                slicesPerPerson = pizzaSlices / people;
        /*
                  4 people - 8 pizzaSlices
                                               --> x = 8 * 1 / 4 = 2
                  1 people - x pizzaSlices

                */
        System.out.println("We ordered cheese pizza with " + pizzaSlices + " slices, " + people + " people ate " + slicesPerPerson + " slices each");
    }
}
