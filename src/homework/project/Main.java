package homework.project;


import homework.project.data.car.RacingCar;
import homework.project.data.factory.Factory;
import homework.project.data.*

public class Main {

	public static void main(String[] args) {
		CarSaler saler = new CarSaler();
		
		Factory<RacingCar> racingFactory = new Factory<>();
		racingFactory.createCar(null);
	}

}
