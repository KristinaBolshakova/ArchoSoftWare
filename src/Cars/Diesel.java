package Cars;

/**
 * класс Дизельное топливо, имплеминтированный от интерфейса Заправочной станции
 */
public class Diesel implements iGasStation {

    @Override
    public void refill() {
        System.out.println("Заправка дизельным топливом.");
    }

}

