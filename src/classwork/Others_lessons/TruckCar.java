package classwork.Others_lessons;

public class TruckCar extends Car{
    private String type;

    public TruckCar(String brand, int year, String type) {
        super(brand, year);
        this.type = type;
    }

    @Override
    public void move() {
        System.out.println("Тртртртртр");
    }

    @Override
    public String toString() {
        return super.toString() + "TruckCar{" +
                "type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
