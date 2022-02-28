package homework.task5.util;

public class Matrix {
	private final Integer[][] matrix;

	public Matrix(Integer[][] matrix) {
		this.matrix = new Integer[matrix.length][matrix[0].length];
		for(int i = 0; i < this.matrix.length; i++) {
			for(int s = 0; s < this.matrix[i].length; s++) {
				this.matrix[i][s] = matrix[i][s];
			}
		}
	}
	
	public Matrix multiply(Matrix secondMatrix) {
		if (this.matrix.length == secondMatrix.matrix[0].length) {
			for(int i = 0; i < this.matrix.length; i++) {
				for(int s = 0; s < this.matrix[i].length; s++) {
					this.matrix[i][s] = this.matrix[i][s] * secondMatrix.matrix[s][i];
				}
			}
			return this;
		}
		System.out.println("Число столбцов первой матрицы не равно числу строк второй матрицы");
		return null;
		
	}

	public Integer[][] getMatrix() {
		return matrix;
	}
	
	public void print() {
		for(int i = 0; i < this.matrix.length; i++) {
			for(int s = 0; s < this.matrix[i].length; s++) {
				System.out.print(this.matrix[i][s]+"\t");
			}
			System.out.println("");
		}
	}
	
}
