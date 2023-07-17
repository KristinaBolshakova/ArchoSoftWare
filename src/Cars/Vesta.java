package Cars;

import java.awt.*;

/**
 * класс, описывающий конкретный автомобиль модели Lada Vesta, наследованный от класса Car
 */
public class Vesta extends Car implements iGasStation {
    private final iGasStation gasStation;

    /**
     * @param brand          - марка автомобиля
     * @param model          - модель автомобиля
     * @param color          - цвет автомобиля
     * @param bodyType       - тип кузова автомобиля
     * @param wheelsCount    - количество колес
     * @param fuel           - тип топлива
     * @param transmission   - тип коробки передач
     * @param engineCapacity - объем двигателя
     * @param gasStation     - объект интерфейса заправочной станции
     */
    public Vesta(String brand, String model, Color color, String bodyType, int wheelsCount, String fuel, String transmission, float engineCapacity, iGasStation gasStation) {
        super(brand, model, color, bodyType, wheelsCount, fuel, transmission, engineCapacity);
        this.gasStation = gasStation;
    }

    @Override
    public void refill() {
        gasStation.refill();
    }

    /**
     * переопределение унаследованных методов
     */

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void service() {
        super.service();
    }

    @Override
    public void gearShifting() {
        super.gearShifting();
    }

    @Override
    public void turnLights() {
        super.turnLights();
    }

    @Override
    public void turnWipers() {
        super.turnWipers();
    }
}
