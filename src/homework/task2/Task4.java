package homework.task2;

import homework.task2.addition.Car;

public class Task4 {
    public static void main(String[] args) {
        Car audi = new Car("AUDI","синий");
        Car bmw = new Car("BMW","черный");
        Car kia = new Car("kia","белый");
        Car vaz = new Car();
        vaz.showCar();
        audi.setColor("красный");
        audi.showCar();
        bmw.setColor("синий");
        bmw.showCar();
        kia.showCar();

    }
}
