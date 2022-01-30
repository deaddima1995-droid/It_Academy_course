/*  Задание 5
        Дан некоторый двумерный массив. Нужно определить является ли он нижней
        треугольной матрицей или же нет.
        https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B0%D1%8F_%D0%BC%D0%B0%D1%82%D1%80%D0%B8%D1%86%D0%B0
*/

package homework.task1;

public class Task5 {
    public static void main(String[] args) {
        int[][] matrix = {{1,0,0,0},{1,1,0,0},{1,1,1,0},{1,1,1,1}};
        checkLowerTriangleMatrix(matrix);
    }
    public static void checkLowerTriangleMatrix(int[][] matrix) {
        int iteration = 0;
        int countZero = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length) {
                System.out.println("Матрица не квадратная");
                return;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0){
                    countZero++;
                }
                iteration++;
            }
        }
        if (iteration == countZero & iteration != 0) {
            System.out.println("Матрица пуста");
            return;
        }
        int k = 1;
        for (int i = 0; i < matrix.length; i++, k++) {
            for (int j = k; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    System.out.println("Матрица не треугольная");
                    return;
                }
            }
        }
        System.out.println("Матрица треугольная нижняя");
    }
}
