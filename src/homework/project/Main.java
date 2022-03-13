package homework.project;


import homework.project.data.car.RacingCar;
import homework.project.data.factory.Factory;

public class Main {

	public static void main(String[] args) {
		Factory<RacingCar> factoryRacingCar = new Factory<RacingCar>();
		factoryRacingCar.createCar(new RacingCar(null, null, 0, null, null, null, null));
		factoryRacingCar.takeCar();
	}

}
