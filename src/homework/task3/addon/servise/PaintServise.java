package homework.task3.addon.servise;

import homework.task3.addon.car.Car;
import homework.task3.addon.setting_car.Color;

public class PaintServise<C> extends Servise{
    public PaintServise(Car car) {
        super(car);
    }

    @Override
    public void change(Enum enums) {
        this.car.changeColor((Color) enums);
    }
}
