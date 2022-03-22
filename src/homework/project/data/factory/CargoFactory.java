package homework.project.data.factory;

import homework.project.data.car.CargoCar;
import homework.project.data.car.car_data.unchange_data.Cargo;
import homework.project.exception_project.NullParametrException;


public class CargoFactory extends Factory {
	private final Cargo[] cargo;

	public CargoFactory() throws NullParametrException {
		super();
		this.cargo = Cargo.values();
		createRandomCarsAndAddToStorage(10);
	}

	@Override
	protected CargoCar createCar(CarBuilder builder) {
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
									this.getCargo()[RND.nextInt(1, this.getCargo().length)])
							)
					);
		}
	}

	public Cargo[] getCargo() {
		return cargo;
	}

}
