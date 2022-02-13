package classwork.Others_lessons;

public abstract class Car implements Movable{
    private final String brand;

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    private final int year;

}
