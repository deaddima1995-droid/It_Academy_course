package homework.project.data.factory;

import homework.project.data.car.TrophyCar;
import homework.project.data.car.car_data.unchange_data.Drive;
import homework.project.exception_project.NullParametrException;

public class TrophyFactory extends Factory {
	private final Drive[] drive;
	
	public TrophyFactory() throws NullParametrException {
		drive = Drive.values();
		createRandomCarsAndAddToStorage(10);
	}

	@Override
	protected TrophyCar createCar(CarBuilder builder) {
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
	public void createRandomCarsAndAddToStorage(int index) throws NullParametrException {
		for (int i = 0; i < index; i++) {
			this.addCarToStorage(
					createCar(
							new CarBuilder(
									this.getColors()[RND.nextInt(1, this.getColors().length)], 
									this.getModels()[RND.nextInt(1, this.getModels().length)], 
									this.getWheels()[RND.nextInt(1, this.getWheels().length)], 
									this.getEngines()[RND.nextInt(1, this.getEngines().length)], 
									this.getOptions(), 
									this.getDrive()[RND.nextInt(1, this.getDrive().length)])
							)
					);
		}
	}

	public Drive[] getDrive() {
		return drive;
	}
}
