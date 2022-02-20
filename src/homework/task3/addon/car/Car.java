package homework.task3.addon.car;

import homework.task3.addon.setting_car.*;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;


public class Car {
    private final Model model;
    private final Integer yearOfManufacture;
    private final Engine engine;
    private Wheel wheel;
    private final LinkedHashSet<Option> options;
    private Color color;


    public Car(Model model, Integer yearOfManufacture, Engine engine, Color color , Option[] options) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.engine = engine;
        this.color = color;
        if (options != null) {
            this.options = new LinkedHashSet<>();
            this.options.addAll(Arrays.asList(options));
        } else {
            this.options = new LinkedHashSet<>();
        }
    }

    public void changeColor(Color color) {
        this.color = color;
    }

    public void addOption(Option option) {
        this.options.add(option);
    }

    public void deleteOption(Option option) {
        this.options.remove(option);
    }
    public void changeWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model == car.model && Objects.equals(yearOfManufacture, car.yearOfManufacture) && engine == car.engine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, yearOfManufacture, engine);
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "model=" + model +
                ", year=" + yearOfManufacture +
                ", color=" + color +
                ", engine=" + engine +
                ", wheel=" + wheel +
                ", options=" + options +
                '}';
    }

}
