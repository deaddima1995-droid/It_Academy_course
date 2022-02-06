package homework.task2;

import homework.task2.addition.Data;

public class Task3 {

    public static void main(String[] args) {
        Data dataOfNumbers = new Data();
        dataOfNumbers.addData(1);
        dataOfNumbers.addData(5);
        dataOfNumbers.addData(6);
        dataOfNumbers.addData(8);
        dataOfNumbers.addData(0);
        dataOfNumbers.addData(1);
        dataOfNumbers.writeArray();
        System.out.println("Среднее значение:"+dataOfNumbers.averageValueOfData());
    }
}
