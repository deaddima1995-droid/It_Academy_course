package classwork.Others_lessons;

public class PassengerCar extends Car{
    private final int seat;

    public PassengerCar(String brand, int year, int seats) {
        super(brand, year);
        this.seat = seats;
    }

    @Override
    public void move() {
        System.out.println("Вжух");
    }

    @Override
    public String toString() {
        return super.toString()+"PassengerCar{" +
                "seat=" + seat +
                '}';
    }

    public int getSeat() {
        return seat;
    }
}
