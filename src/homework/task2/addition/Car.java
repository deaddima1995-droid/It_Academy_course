package homework.task2.addition;

import java.util.Arrays;

public class Car {
    private final String brand;
    private String color;
    private static String[] dataColor = {"Синий","Красный","Зеленый",
                                         "Оранжевый","Черный","Фиолетовый",
                                         "Желтый","Серый","Белый"};

    public Car() {
        this.brand = "Audi";
        this.color = "Синий";
    }
    public Car(String brand,String color) {
        this.brand = brand;
        setColor(color);
    }

    public String[] giveColorArray(String brand) {

        if (brand.equalsIgnoreCase("AUDI")) {
            return Arrays.copyOfRange(dataColor,0,3);
        }
        if (brand.equalsIgnoreCase("BMW")) {
            return Arrays.copyOfRange(dataColor,4,6);
        }
        if (brand.equalsIgnoreCase("KIA")) {
            return Arrays.copyOfRange(dataColor,7,9);
        }
        return dataColor;
    }

    public void showCar(){
        System.out.println("Марка машины:\t"+this.brand+"\tЦвет:\t"+this.color);
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        for (String nextColor: giveColorArray(this.brand)) {
            if (nextColor.equalsIgnoreCase(color)) {
                this.color = color;
            }
        }
    }


}
