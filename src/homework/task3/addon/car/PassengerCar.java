package homework.task3.addon.car;

import homework.task3.addon.setting_car.Color;
import homework.task3.addon.setting_car.Engine;
import homework.task3.addon.setting_car.Model;
import homework.task3.addon.setting_car.Option;

public class PassengerCar extends Car {
    private Integer seats;

    public PassengerCar(Model model, Integer yearOfManufacture, Engine engine, Color color, Option[] options, Integer seats) {
        super(model, yearOfManufacture, engine, color, options);
        this.seats = seats;
    }
}
