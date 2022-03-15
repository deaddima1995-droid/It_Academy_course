package homework.project.data.factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import homework.project.data.Storage;
import homework.project.data.car.*;
import homework.project.data.car.car_data.*;

public class Factory <T extends Car>{
	private final Model[] models;
	private final Engine[] engines;
	private final Color[] colors;
	private final Wheel[] wheels;
	private final List<T> storage;
	
	public Factory () {
		this.models = Model.values();
		this.engines = Engine.values();
		this.colors = Color.values();
		this.wheels = Wheel.values();
		this.storage = new ArrayList<>();
	}
	
	public void createCar() {
		
	}
	
	@SuppressWarnings("unchecked")
	public void takeCar() {
		System.out.println((T) storage.get(0));
	}
	
}
