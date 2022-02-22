package homework.task3.addon.servise;

import homework.task3.addon.car.Car;
import homework.task3.addon.setting_car.Color;
import homework.task3.addon.setting_car.Engine;

public abstract class Servise<T extends Enum> {
    Car car;
    public Servise(Car car) {
        this.car = car;
    }

    public abstract void change(T enums);
}
