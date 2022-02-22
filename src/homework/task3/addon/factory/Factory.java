package homework.task3.addon.factory;

import homework.task3.addon.Storage;
import homework.task3.addon.car.Car;
import homework.task3.addon.servise.Servise;
import homework.task3.addon.setting_car.*;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Factory {
    private final LinkedHashSet<Model> models = new LinkedHashSet<>();
    private final LinkedHashSet<Engine> engines = new LinkedHashSet<>();
    private final LinkedHashSet<Color> colors = new LinkedHashSet<>();
    private final LinkedHashSet<Wheel> wheels = new LinkedHashSet<>();
    private final Storage storageOfFactory;
    private final Servise servise;

    public Factory(Servise servise) {
        this.models.addAll(Arrays.asList(Model.values()));
        this.engines.addAll(Arrays.asList(Engine.values()));
        this.colors.addAll(Arrays.asList(Color.values()));
        this.wheels.addAll(Arrays.asList(Wheel.values()));
        this.storageOfFactory = new Storage();
        this.servise = servise;
    }

    public LinkedHashSet<Model> getModels() {
        return models;
    }

    public LinkedHashSet<Engine> getEngines() {
        return engines;
    }

    public LinkedHashSet<Color> getColors() {
        return colors;
    }

    public LinkedHashSet<Wheel> getWheels() {
        return wheels;
    }

    public void printPossibleCar() {
        System.out.println("Модели -"+models);
        System.out.println("Двигатели -"+engines);
        System.out.println("Цвета -"+colors);
        System.out.println("Диски"+wheels);
    }


}
