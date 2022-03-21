package homework.project.data.factory;

import homework.project.data.car.Car;
import homework.project.data.car.CargoCar;
import homework.project.data.car.car_data.realize_type.Cargo;


public class CargoFactory extends Factory {
	private Cargo[] cargo;

	
	
	public CargoFactory() {
		super();
		this.cargo = Cargo.values();
		createRandomCarsAndAddToStorage(10);
	}



	@Override
	public CargoCar createCar(CarBuilder builder) {
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
	public void createRandomCarsAndAddToStorage(int index) {
		// Нужно сделать рандомный метод getOptions чтобы выдавал разное колличество опций
		for (int i = 0; i < index; i++) {
			this.addCarToStorage(
					createCar(
							new CarBuilder(
									this.getColors()[RND.nextInt(this.getColors().length)], 
									this.getModels()[RND.nextInt(this.getModels().length)], 
									this.getWheels()[RND.nextInt(this.getWheels().length)], 
									this.getEngines()[RND.nextInt(this.getEngines().length)], 
									this.getOptions(), 
									this.getCargo()[RND.nextInt(this.getCargo().length)])
							)
					);
		}
	}



	public Cargo[] getCargo() {
		return cargo;
	}

	

}
