package homework.task3.addon;

import homework.task3.addon.properties.Color;
import homework.task3.addon.properties.Engine;
import homework.task3.addon.properties.Model;
import homework.task3.addon.properties.Option;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    public List<Car> getStorageCar() {
        return storageCar;
    }

    private final List<Car> storageCar = new ArrayList<>();

    public Storage() {
        addCar(new Car(Model.POLO,2022, Engine.LOW, Color.BLUE,new Option[]{}));
        addCar(new Car(Model.GOLF,2022,Engine.COMMON,Color.GREEN,new Option[]{}));
        addCar(new Car(Model.CADDY,2022,Engine.LOW,Color.BLUE,new Option[]{}));
    }

    public void addCar(Car car) {
        this.storageCar.add(car);
    }

    public Car giveCar(Car car) {
        return storageCar.get(storageCar.indexOf(car));
    }

    public void remove(Car car) {
        this.storageCar.remove(car);
    }
    @Override
    public String toString() {
        return "Storage{" +
                "storageCar=" + storageCar +
                '}';
    }
}
