package homework.task3.addon.servise;

import homework.task3.addon.car.Car;
import homework.task3.addon.setting_car.Wheel;

public class WheelServise extends Servise{

    public <T extends Car> void change(T car, Wheel wheel) {
        car.changeWheel(wheel);
    }
}
