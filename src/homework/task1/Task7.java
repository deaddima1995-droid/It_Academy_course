/*      Задание *
            Есть некоторый массив из целых положительних чисел. [1, 0, 4, 8, 9, 1]
            Необходимо написать программу которая посчитает максимально возможную сумму
            которую можно получить из данного массива, с условием что элементы включенные в
            сумму не должны стоять на соседних индексах (должен быть минимум один елемент
            между ними).

Для предложенного массива это: 1, 4, 9 = 14.
*/
package homework.task1;

public class Task7 {

    public static void main(String[] args) {
        int[] array = {0,1,3,2,2,0,0,0,3,2};

        //            19,20,29,24,17,27,17,15,17,14
                        //3,1,1,10
        //                13,11,4,13
        //          10,9,7,8,11
        //          21,20,0,18,21
        /* 1) ищем максимальную сумма для каждного элемента массива слева и справа по одному элементу
            Создаем массив с максимальной суммой , эквивалент длинне самого массива
           2) выбираем максимальное число из суммы
           3) обнуляем у нашего числа соседние числа +-1
             *1 идем в пункт 1)
         */

        //Task1.pasteRandomNumber(array);
        Task1.writeArray(array);
        Task1.writeArray(sumMaxAdjacentNumbers(array));
    }
    public static int sumMaxArrayWithOutAdjacentNumbers(int[] array) {
        int sum = 0;
        if (max(array) == 0) {
            return 0;
        }
        return 0;
    }
    public static int[] sumMaxAdjacentNumbers(int[] array) {
        int[] maxArray = new int[array.length];
// Вправо
        for (int i = 0; i < array.length; i++) {
            int max = Integer.MIN_VALUE;

            for (int j = i; j < array.length; j++) {
                if (j == i + 1 | j== i - 1 | j == i){
                    continue;
                }
                int tmp = max;
                max = Math.max(max,array[i] + array[j]);
                if (tmp < max) {
                        maxArray[i] = array[j];
                }
            }
        }
//лево
        for (int i = array.length - 1; i >= 0; i--) {
            int max = Integer.MIN_VALUE;

            for (int j = i; j >= 0; j--) {
                if (j == i + 1 | j== i - 1 | j == i){
                    continue;
                }
                int tmp = max;
                max = Math.max(max,array[i] + array[j]);
                if (tmp < max) {
                    maxArray[i] += array[j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            maxArray[i] += array[i];
        }
        return maxArray;
        }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max,array[i]);
        }
        return max;
    }
    public static int maxOfArray(int[] array) {

    }
    public static void makeZero(int[] array, int index) {
        if (--index > 0) {
            array[--index] = 0;
        }
        if (++index < array.length - 10) {
            array[++index] = 0;
        }
        array[index] = 0;
    }
}
