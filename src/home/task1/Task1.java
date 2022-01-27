/*      Задание 1:
        Есть некоторый массив, состоящий из целых чисел, также есть некоторое число
        "n". Суть задания посчитать сумму всех элементов массива, однако если в массиве
        встречается число "n" то в сумму его включать не нужно.
*/
package home.task1;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        int[] array = new int[10];
        pasteRandomNumber(array, 0, 10);
        writeArray(array);
        sumArray(array,1);
    }

    public static void pasteRandomNumber(int[] array,int min , int max) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(min,max);
            //array[i] = (int) (Math.random() * ((max - min) + 1)) + min; // можно и так)))
        }
    }
    public static void writeArray(int[] array) {
        for (int cell: array) {
            System.out.print("\t"+cell);
        }
    }
    public static void sumArray(int[] array, int number) {
        if (array.length == 0) {
            System.out.println("Массив не имеет ячеек памяти");
            return;
        }

        int sum = 0;
        int counterOfNumber = 0;

        for (int cell : array) {
            if (cell == number) {
                counterOfNumber++;
                continue;
            }
            sum += cell;
        }

        String count = (counterOfNumber > 1 && counterOfNumber < 5) ? "раза":"раз";

        System.out.println("\nСумма чисел в массиве, за исключением числа "+number+"\tравна = "+sum);
        System.out.println("Число "+number+"\tвстречалось в массиве "+counterOfNumber+" "+count);
    }
}
