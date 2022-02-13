package classwork.Others_lessons;

public class Main {
    public static void main(String[] args) {
        PassengerCar bmw = new PassengerCar("BMW",1995,4);
        PassengerCar renault = new PassengerCar("Renault",2021,4);
        TruckCar man = new TruckCar("MAN",2000,"Арэшки");
        System.out.println(bmw);
        bmw.move();
        System.out.println(man);
        man.move();
    }
    public static void runCar(Movable move) {
        move.move();
    }
}
