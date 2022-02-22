package homework.task3.addon.servise;

import homework.task3.addon.car.Car;
import homework.task3.addon.setting_car.Option;

public class OptionServise extends Servise{

    public <T extends Car> void addOption(T car, Option... options) {
        for (Option option: options) {
            car.addOption(option);
        }
    }

    public <T extends Car> void deleteOption(T car, Option... options) {
        for (Option option: options) {
            car.deleteOption(option);
        }
    }
}
