package homework.task2;

import java.util.Arrays;

public class Task3 {

    private static int[] data = new int[5];
    private static int index = 0;

    public static void main(String[] args) {
        addData(5);
        addData(7);
        addData(3);
        addData(6);
        addData(5);
        writeArray();
        addData(1);
        writeArray();
        addData(2);
        writeArray();
    }

    public static void addData(int number) {
        if (index >= 5) {
            data = Arrays.copyOfRange(data,1,5);
            data = Arrays.copyOf(data,5);
            data[4] = number;

            return;
        }
        data[index] = number;
        index++;
    }
    public static int averageValueOfData() {
        int out = 0;
        for (int value: data) {
            out += value;
        }
        if (out == 0) {
            return 0;
        }
        return out / 5;
    }
    public static void writeArray() {
        for (int value: data) {
            System.out.print(value+"\t");
        }
        System.out.print("\n");
    }
}
