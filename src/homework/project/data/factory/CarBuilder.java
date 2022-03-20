package homework.project.data.factory;

import java.util.Set;

import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.data.car.car_data.realize_type.Cargo;
import homework.project.data.car.car_data.realize_type.Drive;
import homework.project.data.car.car_data.realize_type.Turbo;
import homework.project.data.car.car_data.unchange_data.Engine;
import homework.project.data.car.car_data.unchange_data.Model;

public class CarBuilder {
	private final String type;
	private final Color color;
	private final Model model;
	private final int year;
	private final Wheel wheel;
	private final Engine engine;
	private final Set<Option> options;
	private Cargo cargo;
	private Turbo turbo;
	private Drive drive;
	
	public CarBuilder(Color color, Model model, int year, Wheel wheel, Engine engine, Set<Option> options,
			Cargo cargo) {
		this.color = color;
		this.model = model;
		this.year = year;
		this.wheel = wheel;
		this.engine = engine;
		this.options = options;
		this.cargo = cargo;
		this.type = "CargoCar";
	}
	
	public CarBuilder(Color color, Model model, int year, Wheel wheel, Engine engine, Set<Option> options,
			Turbo turbo) {
		this.color = color;
		this.model = model;
		this.year = year;
		this.wheel = wheel;
		this.engine = engine;
		this.options = options;
		this.turbo = turbo;
		this.type = "RacingCar";
	}

	public CarBuilder(Color color, Model model, int year, Wheel wheel, Engine engine, Set<Option> options,
			Drive drive) {
		this.color = color;
		this.model = model;
		this.year = year;
		this.wheel = wheel;
		this.engine = engine;
		this.options = options;
		this.drive = drive;
		this.type = "TrophyCar";
	}

	public Color getColor() {
		return color;
	}

	public Model getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public Set<Option> getOptions() {
		return options;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public Turbo getTurbo() {
		return turbo;
	}

	public Drive getDrive() {
		return drive;
	}

	public String getType() {
		return type;
	}
	
	
	
	
}
