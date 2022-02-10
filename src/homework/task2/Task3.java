package homework.task2;

import homework.task2.addition.Data;

public class Task3 {

    public static void main(String[] args) {
        Data dataOfNumbers = new Data();
        dataOfNumbers.addData(1);
        dataOfNumbers.addData(2);
        dataOfNumbers.addData(3);
        dataOfNumbers.addData(4);
        dataOfNumbers.addData(5);
        dataOfNumbers.addData(6);
//        dataOfNumbers.addData(7);
//        dataOfNumbers.addData(8);
//        dataOfNumbers.writeArray();
        dataOfNumbers.averageValueOfData();
    }
}
