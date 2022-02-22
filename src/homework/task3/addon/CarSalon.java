package homework.task3.addon;

import homework.task3.addon.factory.Factory;
import homework.task3.addon.servise.Servise;

public class CarSalon {
        private final Servise servise;
        private final Factory[] factory;

    public CarSalon(Servise servise, Factory... factory) {
        this.factory = factory;
        this.servise = servise;
    }
}
