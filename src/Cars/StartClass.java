package Cars;

import java.awt.*;

public class StartClass {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Lada", "vesta", Color.white, "sedan", 4, "petrol", "automatic", 1.6f, new Petrol());
        SUV SUV = new SUV("Toyota", "Land Cruiser", Color.black, "suv", 4, "diesel", "automatic 4WD", 3.3f, new Diesel());

        sedan.refill();
        SUV.refill();

    }
}
