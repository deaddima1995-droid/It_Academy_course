package homework.project.data.car;

import java.time.LocalDate;
import java.util.Set;

import homework.project.data.car.car_data.*;
import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.data.car.car_data.unchange_data.Engine;
import homework.project.data.car.car_data.unchange_data.Model;


public abstract class Car {
	private Color color;
	private final Model model;
	private final int year;
	private Wheel wheel;
	private final Engine engine;
	private final Set<Option> options;
	
	protected Car(Color color, Model model, Wheel wheel, Engine engine, Set<Option> options) {
		this.color = color;
		this.model = model;
		this.year = LocalDate.now().getYear();
		this.wheel = wheel;
		this.engine = engine;
		this.options = options;
	}
	
	public void changeColor(Color color) {
		this.color = color;
	}
	
	public void changeWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	public void addOption(Set<Option> options) {
		this.options.addAll(options);
	}
	
	public void deleteOption(Set<Option> options) {
		this.options.removeAll(options);
	}

	@Override
	public String toString() {
		return "Car [" + (color != null ? "color=" + color + ", " : "") + (model != null ? "model=" + model + ", " : "")
				+ "year=" + year + ", " + (wheel != null ? "wheel=" + wheel + ", " : "")
				+ (engine != null ? "engine=" + engine + ", " : "") + (options != null ? "options=" + options : "")
				+ "]";
	}
	
	
}
