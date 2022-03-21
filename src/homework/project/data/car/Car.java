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
		this.options.clear();
		this.options.addAll(options);
	}
	
	public void addOption(Option... options) {
		for (Option option : options) {
			if (this.options.contains(option)) {
				this.options.add(option);
			}
		}
	}	
	
	public void deleteOption(Option... options) {
		for (Option option : options) {
			if (this.options.contains(option)) {
				this.options.remove(option);
			}
		}
	}
		
		
	

	@Override
	public String toString() {
		return "\nCar [color=" + color + ", model=" + model + ", year=" + year + ", wheel=" + wheel + ", engine=" + engine
				+ ", options=" + options + "]";
	}

	
	
	
}
