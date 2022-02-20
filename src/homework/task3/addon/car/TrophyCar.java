package homework.task3.addon.car;

import homework.task3.addon.setting_car.*;

public class TrophyCar extends Car {
    private WheelDrive actuator;

    public TrophyCar(Model model, Integer yearOfManufacture, Engine engine, Color color, Option[] options, WheelDrive actuator) {
        super(model, yearOfManufacture, engine, color, options);
        this.actuator = actuator;
    }
}
