package homework.project.data.factory;

import java.util.ArrayList;
import java.util.List;

import homework.project.data.car.Car;
import homework.project.data.car.RacingCar;

public class RacingFactory extends Factory {
	private final List<RacingCar> storage = new ArrayList<RacingCar>();

	public RacingFactory() {
		super();
	}

	@Override
	public <T extends Car> void addCar(T car) {
		storage.add((RacingCar) car);
		
	}
	
	@Override
	public RacingCar createCar(CarBuilder builder) {
		if (builder.getTurbo() == null) {
			System.err.println("Ошибка ввода данных");
		}
		return new RacingCar (
				builder.getColor(), 
				builder.getModel(), 
				builder.getWheel(), 
				builder.getEngine(), 
				builder.getOptions(), 
				builder.getTurbo()
		);
	}
	
	@Override
	public String toString() {
		return "RacingFactory [storage=" + storage + "]";
	}


	


	

	




	

}
