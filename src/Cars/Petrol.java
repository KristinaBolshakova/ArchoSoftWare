package Cars;

/**
 * класс Бензиновое топливо, имплеминтированный от интерфейса Заправочной станции
 */
public class Petrol implements iGasStation {
    @Override
    public void refill() {
        System.out.println("Заправка бензином.");
    }
}
