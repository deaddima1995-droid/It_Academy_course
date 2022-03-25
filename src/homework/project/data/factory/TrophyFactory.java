package homework.project.data.factory;

import homework.project.data.car.TrophyCar;
import homework.project.data.car.car_data.unchange_data.Drive;
import homework.project.exception_project.NullParametrException;

public class TrophyFactory extends Factory {
	private final Drive[] drive;
	
	public TrophyFactory() {
		drive = Drive.values();
		createRandomCarsAndAddToStorage(3);
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
	public void createRandomCarsAndAddToStorage(int index) {
		for (int i = 0; i < index; i++) {
			try {
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
			} catch (NullParametrException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public Drive[] getDrive() {
		return drive;
	}
}
