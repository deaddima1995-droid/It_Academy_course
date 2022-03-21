package homework.project.data.factory;

import java.util.ArrayList;
import java.util.List;

import homework.project.data.car.Car;
import homework.project.data.car.TrophyCar;
import homework.project.data.car.car_data.realize_type.Drive;

public class TrophyFactory extends Factory {
	private final Drive[] drive;
	
	public TrophyFactory() {
		drive = Drive.values();
	}

	@Override
	public TrophyCar createCar(CarBuilder builder) {
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
	public void createRandomCarsAndAddToStorage(int index) {
		for (int i = 0; i < index; i++) {
			this.addCarToStorage(
					createCar(
							new CarBuilder(
									this.getColors()[RND.nextInt(this.getColors().length)], 
									this.getModels()[RND.nextInt(this.getModels().length)], 
									this.getWheels()[RND.nextInt(this.getWheels().length)], 
									this.getEngines()[RND.nextInt(this.getEngines().length)], 
									this.getOptions(), 
									this.getDrive()[RND.nextInt(this.getDrive().length)])
							)
					);
		}
	}

	public Drive[] getDrive() {
		return drive;
	}
}
