package homework.project.data.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import homework.project.data.car.*;
import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.data.car.car_data.unchange_data.Engine;
import homework.project.data.car.car_data.unchange_data.Model;

public abstract class Factory {
	protected final static Random RND = new Random();
	private final Model[] models;
	private final Engine[] engines;
	private final Color[] colors;
	private final Wheel[] wheels;
	private final Option[] options;
	private final List<Car> storage;
	
	public Factory () {
		this.models = Model.values();
		this.engines = Engine.values();
		this.colors = Color.values();
		this.wheels = Wheel.values();
		this.options = Option.values();
		this.storage = new ArrayList<>();
		//createRandomCarsAndAddToStorage(10);
	}
	
	protected abstract Car createCar(CarBuilder builder);
	
	protected abstract void createRandomCarsAndAddToStorage(int index);

	
	public Car takeCarFromFactoryOrCreateHim(CarBuilder builder) {
		for (Car car : storage) {
			if (car.compareAllParametrsOfCar(builder)) {
				System.out.println("Взяли тачку со склада завода");
				return car;
			} else if (car.compareFinalParametrsOfCar(builder)) {
				
				if (!car.getColor().equals(builder.getColor())) {
					car.changeColor(builder.getColor());
				}
				if (!car.getWheel().equals(builder.getWheel())) {
					car.changeWheel(builder.getWheel());
				}
				if (!car.getOptions().containsAll(builder.getOptions())) {
					car.deleteOption(Option.values());
					car.addOption(builder.getOptions());
				}
				
				System.out.println("Взяли тачку со склада и изменили её");
				storage.remove(car);
				return car;
			}
		}
		System.out.println("Создали новую тачку на заводе");
		return createCar(builder);
	}

	protected <T extends Car> void addCarToStorage(T car) {
		storage.add((T) car);
	}

	public Model[] getModels() {
		return models;
	}

	public Engine[] getEngines() {
		return engines;
	}

	public Color[] getColors() {
		return colors;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public List<Car> getStorage() {
		return storage;
	}

	public Option[] getOptions() {
		return options;
	}

	@Override
	public String toString() {
		return "Factory [storage=" + storage + "]";
	}

}
