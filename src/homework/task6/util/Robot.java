package homework.task6.util;

public class Robot {
	private static int counterId = 0;
	private final int ID;

	
	public Robot() {
		counterId++;
		this.ID = counterId;
	}

	@Override
	public String toString() {
		return "Robot [ID=" + ID + "]";
	}
	
}
