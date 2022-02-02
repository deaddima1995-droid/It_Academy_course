package classwork;

import java.util.Arrays;

public class IntArray {
    private int[] array = new int[0];


    public IntArray() {

    }
    public void addNumber(int number) {
        array = Arrays.copyOf(array,array.length+1);
        array[array.length - 1] = number;
    }
    public void deleteNumber() {
        array = Arrays.copyOf(array,array.length - 1);
    }

    public void writeArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
}
