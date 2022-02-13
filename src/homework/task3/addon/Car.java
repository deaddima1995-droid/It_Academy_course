package homework.task3.addon;

import homework.task3.addon.properties.*;

import java.util.Arrays;

public class Car {
    private final Model model;
    private final Integer yearOfManufacture;
    private final Engine engine;
    private Wheel wheel;
    private Option[] options;
    private Color color;


    public Car(Model model, Integer yearOfManufacture, Engine engine, Color color) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.engine = engine;
        this.color = color;
    }

    public void changeWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void addOptions(Option[] options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", yearOfManufacture=" + yearOfManufacture +
                ", engine=" + engine +
                ", wheel=" + wheel +
                ", options=" + Arrays.toString(options) +
                ", color=" + color +
                '}';
    }

    public void changeColor(Color color) {
        this.color = color;
    }
}
