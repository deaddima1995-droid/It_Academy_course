package homework.task3;

import homework.task3.addon.CarSalon;
import homework.task3.addon.factory.Factory;
import homework.task3.addon.servise.Servise;

public class Main {
    public static void main(String[] args) {
        Servise carServise = new Servise();
        Factory factory = new Factory(carServise);
        CarSalon carSalon = new CarSalon(carServise);
    }
}
