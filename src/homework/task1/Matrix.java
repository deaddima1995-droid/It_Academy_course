package homework.task1;

public class Matrix {
    private int[][] matrix;

    public Matrix(int degree,int min, int max) {
        this.matrix = new int[degree][degree];
        pasteRandomNumberInMatrix(min,max);
    }

    public Matrix sumMatrix(Matrix matrixSecond) {
        if (matrix.length != matrixSecond.getMatrix().length) {
            System.out.println("Матрицы имеют разные размерности");
            return this;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] + matrixSecond.getMatrix()[i][j];
            }
        }
        return this;
    }

    public Matrix diffMatrix(Matrix matrixSecond) {
        if (matrix.length != matrixSecond.getMatrix().length) {
            System.out.println("Матрицы имеют разные размерности");
            return this;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] - matrixSecond.getMatrix()[i][j];
            }
        }
        return this;
    }

    public void pasteRandomNumberInMatrix(int min, int max) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * ((max - min) + 1)) + min;
            }
        }
    }

    public void writeMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public int[][] getMatrix() {
        return matrix;
    }


    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
}
