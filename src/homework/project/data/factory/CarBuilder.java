package homework.project.data.factory;

import java.util.Set;

import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.data.car.car_data.unchange_data.Cargo;
import homework.project.data.car.car_data.unchange_data.Drive;
import homework.project.data.car.car_data.unchange_data.Engine;
import homework.project.data.car.car_data.unchange_data.Model;
import homework.project.data.car.car_data.unchange_data.Turbo;
import homework.project.exception_project.NullParametrException;

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
	
	private CarBuilder(Color color, Model model, Wheel wheel, Engine engine, Option[] options) throws NullParametrException {
		this.color = color;
		this.model = model;
		this.wheel = wheel;
		this.engine = engine;
		this.options = Set.of(options);
		if (this.color == null || this.model == null || this.wheel == null || this.engine == null || this.options == null) {
			throw new NullParametrException("Параметры для создания машины Указаны null");
		}
	}
	
	public CarBuilder(Color color, Model model, Wheel wheel, Engine engine, Option[] options,
			Cargo cargo) throws NullParametrException {
		this(color, model, wheel, engine, options);
		this.cargo = cargo;
		this.type = "CargoCar";
		if (this.cargo == null) {
			throw new NullParametrException("Параметры для создания машины Указаны null");
		}
	}
	
	public CarBuilder(Color color, Model model, Wheel wheel, Engine engine, Option[] options,
			Turbo turbo) throws NullParametrException {
		this(color, model, wheel, engine, options);
		this.turbo = turbo;
		this.type = "RacingCar";
		if (this.turbo == null) {
			throw new NullParametrException("Параметры для создания машины Указаны null");
		}
	}

	public CarBuilder(Color color, Model model, Wheel wheel, Engine engine, Option[] options,
			Drive drive) throws NullParametrException {
		this(color, model, wheel, engine, options);
		this.drive = drive;
		this.type = "TrophyCar";
		if (this.drive == null) {
			throw new NullParametrException("Параметры для создания машины Указаны null");
		}
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
				+ (drive != null ? "drive=" + drive + ", " : "") 
				+ "]";
	}

}
