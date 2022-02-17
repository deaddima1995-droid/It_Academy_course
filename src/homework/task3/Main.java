package homework.task3;

import homework.task3.addon.Car;
import homework.task3.addon.properties.*;

public class Main {
    public static void main(String[] args) {
        Option[] bmwOption = {Option.AUDIO, Option.BLUETOOTH , Option.CONDITIONER};
        Car bmw = new Car(Model.GOLF,2021, Engine.JZ, Color.BLUE,bmwOption);
        System.out.println(bmw);
        bmw.deleteOption(Option.AUDIO);
        bmw.addOption(Option.HEATED_SEATS);
        System.out.println(bmw);
    }
}
