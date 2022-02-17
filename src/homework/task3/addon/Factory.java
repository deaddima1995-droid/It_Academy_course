package homework.task3.addon;

import homework.task3.addon.properties.*;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Factory {
    private final LinkedHashSet<Model> models = new LinkedHashSet<>();
    private final LinkedHashSet<Engine> engines = new LinkedHashSet<>();
    private final LinkedHashSet<Color> colors = new LinkedHashSet<>();
    private final LinkedHashSet<Wheel> wheels = new LinkedHashSet<>();
    public final Storage storageOfFactory;

    public Factory(Model[] models,Engine[] engines, Color[] colors, Wheel[] wheels) {
        this.models.addAll(Arrays.asList(models));
        this.engines.addAll(Arrays.asList(engines));
        this.colors.addAll(Arrays.asList(colors));
        this.wheels.addAll(Arrays.asList(wheels));
        storageOfFactory = new Storage();

    }

    public void printPossibleCar() {
        System.out.println("Модели -"+models);
        System.out.println("Двигатели -"+engines);
        System.out.println("Цвета -"+colors);
        System.out.println("Диски"+wheels);
    }

    protected Car TakeCar(Model model, Integer yearOfManufacture, Engine engine, Color color , Option[] options) {
        List<Car> list = storageOfFactory.getStorageCar();
        for (Car car: list) {
            if (car.equals(new Car(model, yearOfManufacture, engine, color , options))) {
                storageOfFactory.remove(car);
                return car;
            }
        }
        return null;
    }
}
