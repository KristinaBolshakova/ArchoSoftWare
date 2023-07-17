package Cars;

import java.awt.*;

/**
 * абстрактный класс, его свойства и методы
 */
public abstract class Car {
    /**
     * поля класса Car
     */
    private String brand;
    private String model;
    private Color color;
    private String bodyType;
    private int wheelsCount;
    private String fuel;
    private String transmission;
    private float engineCapacity;

    /**
     * @param brand          - марка автомобиля
     * @param model          - модель автомобиля
     * @param color          - цвет автомобиля
     * @param bodyType       - тип кузова автомобиля
     * @param wheelsCount    - количество колес
     * @param fuel           - тип топлива
     * @param transmission   - тип коробки передач
     * @param engineCapacity - объем двигателя
     */
    public Car(String brand, String model, Color color, String bodyType, int wheelsCount, String fuel, String transmission, float engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.wheelsCount = wheelsCount;
        this.fuel = fuel;
        this.transmission = transmission;
        this.engineCapacity = engineCapacity;
    }

    /**
     * метод движения
     */
    public void move() {
    }

    /**
     * метод обслуживания автомобиля
     */
    public void service() {
    }

    /**
     * метод переключения передач
     */
    public void gearShifting() {
    }

    /**
     * метод включения фар
     */
    public void turnLights() {
    }

    /**
     * метод включения дворников
     */
    public void turnWipers() {
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
