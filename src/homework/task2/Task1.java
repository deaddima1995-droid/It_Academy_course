package homework.task2;

import homework.task2.addition.Month;

public class Task1 {
    public static void main(String[] args) {
        Integer number = Month.getNumberByName("January");
        System.out.println(number);
        System.out.println(Month.getNameByNumber(5));
    }
}
