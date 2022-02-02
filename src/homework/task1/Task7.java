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
        int[] array = {9,10,10,4,0,10,0,1,7,0,2,25};
        int[] temp = sumMaxAdjacentNumbers(array);
        //Task1.pasteRandomNumber(array);
       Task1.writeArray(array);
        Task1.writeArray(sumMaxAdjacentNumbers(array));
        //makeZero(array,2);
        //Task1.writeArray(array);
        int our = sumMaxArrayWithOutAdjacentNumbers(array,temp);
        System.out.println(our);

    }
    public static int sumMaxArrayWithOutAdjacentNumbers(int[] array,int[] temp) {
        int sum = 0;
        if (max(array) == 0) {
            return 0;
        }
        int maxTempIndex = maxOfArray(temp);
        sum += array[maxTempIndex];
        makeZero(temp, maxTempIndex);
        makeZero(array,maxTempIndex);

        return sum + sumMaxArrayWithOutAdjacentNumbers(array,temp);
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
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int tmp = max;
            max = Math.max(max,array[i]);
            if (tmp < max) {
                index = i;
            }
        }
        return index;
    }
    public static void makeZero(int[] array, int index) {
        int fIndex = index - 1;
        int lIndex = index + 1;
        if (fIndex >= 0) {
            array[fIndex] = 0;
        }
        if (lIndex <= array.length - 1) {
            array[lIndex] = 0;
        }
        array[index] = 0;
    }
}
