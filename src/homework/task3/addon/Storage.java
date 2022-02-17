package homework.task3.addon;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Car> storageCar = new ArrayList<Car>();

    public Storage() {

    }

    public void addCar(Car car) {
        this.storageCar.add(car);
    }

    public Car giveCar(Car car) {
        return storageCar.get(storageCar.indexOf(car));
    }
}
