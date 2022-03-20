package homework.project.data.factory;

import java.util.ArrayList;
import java.util.List;

import homework.project.data.car.Car;
import homework.project.data.car.CargoCar;

public class CargoFactory extends Factory {
	
	private final List<CargoCar> storage = new ArrayList<CargoCar>();

	@Override
	public Car createCar(CarBuilder builder) {
		return new CargoCar(
				builder.getColor(), 
				builder.getModel(), 
				builder.getWheel(), 
				builder.getEngine(), 
				builder.getOptions(), 
				builder.getCargo()
		);
	}

	@Override
	public <T extends Car> void addCar(T car) {
		storage.add((CargoCar) car);
	}

}
