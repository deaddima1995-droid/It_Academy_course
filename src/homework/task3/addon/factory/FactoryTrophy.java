package homework.task3.addon.factory;

import homework.task3.addon.servise.Servise;
import homework.task3.addon.setting_car.Color;
import homework.task3.addon.setting_car.Engine;
import homework.task3.addon.setting_car.Model;
import homework.task3.addon.setting_car.Wheel;

import java.util.LinkedHashSet;

public class FactoryTrophy extends Factory {
    public FactoryTrophy(Servise servise) {
        super(servise);
    }

    @Override
    public LinkedHashSet<Model> getModels() {
        return super.getModels();
    }

    @Override
    public LinkedHashSet<Engine> getEngines() {
        return super.getEngines();
    }

    @Override
    public LinkedHashSet<Color> getColors() {
        return super.getColors();
    }

    @Override
    public LinkedHashSet<Wheel> getWheels() {
        return super.getWheels();
    }

    @Override
    public void printPossibleCar() {
        super.printPossibleCar();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
