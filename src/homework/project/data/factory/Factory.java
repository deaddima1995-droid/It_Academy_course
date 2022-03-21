package homework.project.data.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

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
		createRandomCarsAndAddToStorage(10);
	}
	
	public abstract Car createCar(CarBuilder builder);
	
	public abstract void createRandomCarsAndAddToStorage(int index);

	public <T extends Car> void addCarToStorage(T car) {
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

}
