/*      Задание 1:
        Есть некоторый массив, состоящий из целых чисел, также есть некоторое число
        "n". Суть задания посчитать сумму всех элементов массива, однако если в массиве
        встречается число "n" то в сумму его включать не нужно.
*/
package homework.task1;

public class Task1 {

    public static void main(String[] args) {
        int numberN = 5;
        int[] array = new int[10];
        pasteRandomNumber(array);
        writeArray(array);
        sumArray(array,numberN);
    }

    public static void sumArray(int[] array, int number) {
        int sum = 0;
        if (array.length == 0) {
            System.out.println("Массив не имеет ячеек");
            return;
        }
        for (int cell : array) {
            if (cell == number) {
                continue;
            }
            sum += cell;
        }
        System.out.println("\nСумма чисел в массиве, за исключением числа " + number + "\tравна = " + sum);
    }

    public static void pasteRandomNumber(int[] array) {
        int min = 0;
        int max = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((max - min) + 1)) + min;
        }
    }

    public static void writeArray(int[] array) {
        for (int cell : array) {
            System.out.print("\t" + cell);
        }
    }
}