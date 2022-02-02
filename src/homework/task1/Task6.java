package homework.task1;

public class Task6 {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(5,0,10);
        Matrix matrix2 = new Matrix(5,0,10);
        Matrix matrix3 = new Matrix(5,0,10);

        matrix1.writeMatrix();
        System.out.println("+\n");
        matrix2.writeMatrix();
        System.out.println("=\n");
        matrix1 = matrix1.sumMatrix(matrix2);
        matrix1.writeMatrix();

        matrix3 = matrix3.diffMatrix(matrix1);
    }
}
