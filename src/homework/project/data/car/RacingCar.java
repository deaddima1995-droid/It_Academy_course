package homework.project.data.car;

import java.util.Set;

import homework.project.data.car.car_data.*;
import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.data.car.car_data.unchange_data.Engine;
import homework.project.data.car.car_data.unchange_data.Model;
import homework.project.data.car.car_data.unchange_data.Turbo;
import homework.project.data.factory.CarBuilder;


public class RacingCar extends Car {
	private final Turbo turbo;

	public RacingCar(Color color, Model model, Wheel wheel, Engine engine, Set<Option> options,Turbo turbo
	) {
		super(color, model, wheel, engine, options);
		this.turbo = turbo;
	}

	@Override
	public String toString() {
		return "\nRacingCar " + "Турбо = " + turbo
				+ (super.toString() != null ? super.toString() : "");
	}

	@Override
	public boolean compareAllParametrsOfCar(CarBuilder builder) {
		
		if (this.getColor().equals(builder.getColor()) &&
			this.getModel().equals(builder.getModel()) &&
			this.getWheel().equals(builder.getWheel()) &&
			this.getEngine().equals(builder.getEngine()) &&
			this.getOptions().containsAll(builder.getOptions()) &&
			this.getTurbo().equals(builder.getTurbo())
		) {
		return true;
		}
		return false;
	}
	
	@Override
	public boolean compareFinalParametrsOfCar(CarBuilder builder) {
		
		if (this.getModel().equals(builder.getModel()) &&		
			this.getEngine().equals(builder.getEngine()) &&
			this.getTurbo().equals(builder.getTurbo())
		) {
		return true;
		}
		return false;
	}
	
	public Turbo getTurbo() {
		return turbo;
	}

	
	
	
}
