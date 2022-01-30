/*  Задание 4
        Дан некоторый двумерный массив. Нужно определить каких чисел в нем больше,
        положительных или отрицательных.
 */
package homework.task1;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Task1.pasteRandomNumber(array);
        Task1.writeArray(array);
        searchHasMostPosAndNegativeNumbers(array);
    }
    public static void searchHasMostPosAndNegativeNumbers(int[][] array) {
        int counter = 0;
        int countZero = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    counter++;
                }
                else if (array[i][j] < 0) {
                    counter--;
                }
                else {
                    countZero++;
                }
            }
        }
        if (counter != 0) {
            counter -= countZero;
            if (counter > 0) {
                System.out.println("Положительных чисел больше");
            }
            else if (counter < 0) {
                System.out.println("Отрицательных чисел больше");
            }
            else {
                System.out.println("Колличество положительных и отрицательных чисел равно");
            }
        }
        else {
            System.out.println("В массиве одни нули");
        }

    }

}
