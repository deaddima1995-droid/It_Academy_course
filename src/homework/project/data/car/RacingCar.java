package homework.project.data.car;

import java.util.Set;

import homework.project.data.car.car_data.*;
import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.data.car.car_data.realize_type.Turbo;
import homework.project.data.car.car_data.unchange_data.Engine;
import homework.project.data.car.car_data.unchange_data.Model;


public class RacingCar extends Car {
	private Turbo turbo;

	public RacingCar(Color color, Model model, Wheel wheel, Engine engine, Set<Option> options,Turbo turbo
	) {
		super(color, model, wheel, engine, options);
		this.turbo = turbo;
	}

	@Override
	public String toString() {
		return "RacingCar [" + (turbo != null ? "turbo=" + turbo + ", " : "")
				+ (super.toString() != null ? "toString()=" + super.toString() : "") + "]";
	}

	public Turbo getTurbo() {
		return turbo;
	}
	

	public void setTurbo(Turbo turbo) {
		this.turbo = turbo;
	}
	
	
	
}
