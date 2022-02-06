package homework.task2.addition;

import java.util.Arrays;

public class Data {
    private int[] dataValue = new int[5];
    private int index = 0;

    public void addData(int number) {
        if (index >= dataValue.length) {
            dataValue = Arrays.copyOfRange(dataValue,1,index);
            dataValue = Arrays.copyOf(dataValue,index);
            dataValue[index - 1] = number;
            return;
        }
        dataValue[index] = number;
        index++;
    }
    public int averageValueOfData() {
        if (index == 0) {
            return 0;
        }
        int out = 0;
        for (int value: dataValue) {
            out += value;
        }
        return out / index;
    }
    public void writeArray() {
        for (int value: dataValue) {
            System.out.print(value+"\t");
        }
        System.out.print("\n");
    }
}
