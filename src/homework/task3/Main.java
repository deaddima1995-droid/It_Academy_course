package homework.task3;

import homework.task3.addon.Car;
import homework.task3.addon.Factory;
import homework.task3.addon.properties.*;

public class Main {
    public static void main(String[] args) {
        Factory volskwagen = new Factory(new Model[]{Model.CADDY,}, new Engine[] {Engine.LOW},new Color[]{Color.GREEN},new Wheel[] {Wheel.R16});
        //System.out.println(volskwagen.storageOfFactory.toString());
        volskwagen.printPossibleCar();
    }
}
