package homework.project.data.factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;

import homework.project.data.Storage;
import homework.project.data.car.*;
import homework.project.data.car.car_data.*;
import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.data.car.car_data.realize_type.Cargo;
import homework.project.data.car.car_data.unchange_data.Engine;
import homework.project.data.car.car_data.unchange_data.Model;
import homework.project.interfaces.CreatebleCar;

public abstract class Factory {
	private final static Random RND = new Random();
	private final Model[] models;
	private final Engine[] engines;
	private final Color[] colors;
	private final Wheel[] wheels;
	private final List<Car> storage;
	
	public Factory () {
		this.models = Model.values();
		this.engines = Engine.values();
		this.colors = Color.values();
		this.wheels = Wheel.values();
		this.storage = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			storage.add(createRandomCar());
		}
	}
	
	public abstract Car createCar(Color color, Model model, Wheel wheel, Engine engine, Set<Option> options, byte typeOfCar);

	public abstract Car createRandomCar();
	
}
