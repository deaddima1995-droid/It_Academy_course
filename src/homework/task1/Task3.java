/*      Задание 3
            Дан некоторый массив, суть задания инвертировать его.
*/
package homework.task1;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Task1.pasteRandomNumber(array);
        Task1.writeArray(array);
        invertArray(array);
        Task1.writeArray(array);
    }
    public static void invertArray(int[] array) {
        for (int i = 0 ,j = array.length - 1; i < array.length / 2; i++ , j--) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
        }
    }
}
