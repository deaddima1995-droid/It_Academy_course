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
	}
	
	public abstract Car createCar(CarBuilder builder);

	public abstract <T extends Car> void addCar(T car);

}
