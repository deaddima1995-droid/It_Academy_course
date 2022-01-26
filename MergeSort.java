package my.home.task;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        int[] massive = new int[1000];
        massive = addRandomNumber(massive);
        System.out.println("Исходный массив");
        writeMassive(massive);
        System.out.println("\nОтсортированнный массив");
        writeMassive(mergeSort(massive));

    }
    public static int[] addRandomNumber(int[] mass) {
        Random rnd = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt(1000);
        }
        return mass;
    }

    public static void writeMassive(int[] mass) {
        for (int j : mass) {
            System.out.print("\t" + j);
        }
    }

    public static int[] mergeSort(int[] mass) {
        if (mass.length == 0) {
            System.out.println("В массиве отсутствуют элементы");
            return mass;
        }
        if (mass.length < 2) {
            return mass;
        }
        int[] firstMass = new int[mass.length/2];
        int[] secondMass;
        firstMass = Arrays.copyOfRange(mass,0, firstMass.length);
        secondMass = Arrays.copyOfRange(mass, firstMass.length, mass.length);

        firstMass = mergeSort(firstMass);
        secondMass = mergeSort(secondMass);

        return quickSort(firstMass, secondMass);
    }

    public static int[] quickSort(int[] massOne, int[] massTwo) {
        int[] massOut = new int[massOne.length + massTwo.length];
        int positionOne = 0;
        int positionTwo = 0;
        for (int i = 0; i < massOut.length; i++) {
            if (positionOne >= massOne.length) {
                massOut[i] = massTwo[positionTwo];
                positionTwo++;
            }
            else if (positionTwo >= massTwo.length) {
                massOut[i] = massOne[positionOne];
                positionOne++;
            }
            else if (massOne[positionOne] < massTwo[positionTwo]) {
                massOut[i] = massOne[positionOne];
                positionOne++;
            }
            else {
                massOut[i] = massTwo[positionTwo];
                positionTwo++;
            }
        }
        return massOut;
    }
}
