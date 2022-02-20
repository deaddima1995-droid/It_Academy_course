package homework.task3.addon.car;

import homework.task3.addon.setting_car.*;

public class CargoCar extends Car{
    private final Cargo cargo;

    public CargoCar(Model model, Integer yearOfManufacture, Engine engine, Color color, Option[] options, Cargo cargo) {
        super(model, yearOfManufacture, engine, color, options);
        this.cargo = cargo;
    }
}
