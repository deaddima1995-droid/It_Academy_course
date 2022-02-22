package homework.task3.addon;

import homework.task3.addon.car.Car;
import homework.task3.addon.setting_car.*;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Factory {
    private final LinkedHashSet<Model> models = new LinkedHashSet<>();
    private final LinkedHashSet<Engine> engines = new LinkedHashSet<>();
    private final LinkedHashSet<Color> colors = new LinkedHashSet<>();
    private final LinkedHashSet<Wheel> wheels = new LinkedHashSet<>();
    public final Storage storageOfFactory;

    public Factory() {
        this.models.addAll(Arrays.asList(Model.values()));
        this.engines.addAll(Arrays.asList(Engine.values()));
        this.colors.addAll(Arrays.asList(Color.values()));
        this.wheels.addAll(Arrays.asList(Wheel.values()));
        storageOfFactory = new Storage();

    }

    public void printPossibleCar() {
        System.out.println("Модели -"+models);
        System.out.println("Двигатели -"+engines);
        System.out.println("Цвета -"+colors);
        System.out.println("Диски"+wheels);
    }


}
