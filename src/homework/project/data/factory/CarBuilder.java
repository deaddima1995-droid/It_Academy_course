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
	private final Color color;
	private final Model model;
	private final Wheel wheel;
	private final Engine engine;
	private final Set<Option> options;
	private String type;
	private Cargo cargo;
	private Turbo turbo;
	private Drive drive;
	
	private CarBuilder(Color color, Model model, Wheel wheel, Engine engine, Option[] options) {
		this.color = color;
		this.model = model;
		this.wheel = wheel;
		this.engine = engine;
		this.options = Set.of(options);
	}
	
	public CarBuilder(Color color, Model model, Wheel wheel, Engine engine, Option[] options,
			Cargo cargo) {
		this(color, model, wheel, engine, options);
		this.cargo = cargo;
		this.type = "CargoCar";
	}
	
	public CarBuilder(Color color, Model model, Wheel wheel, Engine engine, Option[] options,
			Turbo turbo) {
		this(color, model, wheel, engine, options);
		this.turbo = turbo;
		this.type = "RacingCar";
	}

	public CarBuilder(Color color, Model model, Wheel wheel, Engine engine, Option[] options,
			Drive drive) {
		this(color, model, wheel, engine, options);
		this.drive = drive;
		this.type = "TrophyCar";
	}

	public Color getColor() {
		return color;
	}

	public Model getModel() {
		return model;
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
	
	public Option[] getOptionsAsArray() {
		return (Option[]) options.toArray();
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

	@Override
	public String toString() {
		return "CarBuilder ["
				+ "Тип = " + type + ", "
				+ "Цвет = " + color + ","
				+ "Модель = " + model + ", "
				+ "Колеса = " + wheel + ", "
				+ "Двигатель = "+ engine + ", "
				+ "Опции =" + (options != null ? "options=" + options + ", " : "") + ", "
				+ (cargo != null ? "cargo=" + cargo + ", " : "")
				+ (turbo != null ? "turbo=" + turbo + ", " : "")
				+ (drive != null ? "drive=" + drive + ", " : drive) 
				+ "]";
	}
	
	
	
}
