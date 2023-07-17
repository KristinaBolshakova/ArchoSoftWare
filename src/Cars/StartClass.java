package Cars;

import java.awt.*;

public class StartClass {
    public static void main(String[] args) {
        Vesta vesta = new Vesta("Lada", "vesta", Color.white, "sedan", 4, "petrol", "automatic", 1.6f, new Petrol());
        LandCruiser landCruiser = new LandCruiser("Toyota", "Land Cruiser", Color.black, "suv", 4, "diesel", "automatic 4WD", 3.3f, new Diesel());

        vesta.refill();
        landCruiser.refill();

    }
}
