package homework.task3;

import homework.task3.addon.car.Car;
import homework.task3.addon.servise.PaintServise;
import homework.task3.addon.setting_car.*;

public class Main {
    public static void main(String[] args) {
        //Factory volskwagen = new Factory(new Model[]{Model.CADDY,}, new Engine[] {Engine.LOW},new Color[]{Color.GREEN},new Wheel[] {Wheel.R16});
        //System.out.println(volskwagen.storageOfFactory.toString());
        //volskwagen.printPossibleCar();
        Car caddy = new Car();
        PaintServise<Color> paiter = new PaintServise<Color>(caddy);
        paiter.change(Model.CADDY);
        System.out.println(caddy);
    }
}
