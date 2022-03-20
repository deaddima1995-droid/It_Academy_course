package homework.project.data.factory;

import java.util.ArrayList;
import java.util.List;

import homework.project.data.car.Car;
import homework.project.data.car.TrophyCar;

public class TrophyFactory extends Factory {
	private final List<TrophyCar> storage = new ArrayList<TrophyCar>();
	
	@Override
	public Car createCar(CarBuilder builder) {
		return new TrophyCar(
				builder.getColor(), 
				builder.getModel(), 
				builder.getWheel(), 
				builder.getEngine(), 
				builder.getOptions(), 
				builder.getDrive()
		);
	}

	@Override
	public <T extends Car> void addCar(T car) {
		storage.add((TrophyCar) car);
	}

}
