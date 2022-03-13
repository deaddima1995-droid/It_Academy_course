package homework.project.data.factory;

import java.util.ArrayList;
import java.util.List;

import homework.project.data.Storage;
import homework.project.data.car.Car;
import homework.project.data.car.CargoCar;
import homework.project.data.car.RacingCar;
import homework.project.data.car.car_data.*;

public class Factory <T extends Car>{
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
	
	public void createCar(T carType) {
		storage.add(new RacingCar(null, null, 2022, null, null, null, null));
	}
	
	@SuppressWarnings("unchecked")
	public void takeCar() {
		System.out.println((T) storage.get(0));
	}
	
}
