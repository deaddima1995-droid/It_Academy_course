package homework.task3.addon.servise;

import homework.task3.addon.car.Car;
import homework.task3.addon.setting_car.Color;

public class PaintServise extends Servise{

    public <T extends Car> void change(T car,Color color) {
        car.changeColor(color);
    }
}
