package homework.project.data.factory;

import homework.project.data.car.RacingCar;
import homework.project.data.car.car_data.realize_type.Turbo;

public class RacingFactory extends Factory {
	public final Turbo[] turbo = Turbo.values();

	public RacingFactory() {
		super();
		createRandomCarsAndAddToStorage(10);
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
									this.getTurbo()[RND.nextInt(this.getTurbo().length)])
							)
					);
		}
	}

	public Turbo[] getTurbo() {
		return this.turbo;
	}
	

	


	

	




	

}
