package homework.project.data.car;

import java.util.Set;

import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.data.car.car_data.realize_type.Cargo;
import homework.project.data.car.car_data.unchange_data.Engine;
import homework.project.data.car.car_data.unchange_data.Model;
import homework.project.data.factory.CarBuilder;

public class CargoCar extends Car {
	private final Cargo cargo;
	
	public CargoCar(Color color, Model model, Wheel wheel, Engine engine, Set<Option> options, Cargo cargo) {
		super(color, model, wheel, engine, options);
		this.cargo = cargo;
	}

	@Override
	public boolean compareAllParametrsOfCar(CarBuilder builder) {
		if (this.getColor().equals(builder.getColor()) &&
			this.getModel().equals(builder.getModel()) &&
			this.getWheel().equals(builder.getWheel()) &&
			this.getEngine().equals(builder.getEngine()) &&
			this.getOptions().containsAll(builder.getOptions()) &&
			this.getCargo().equals(builder.getCargo())
		) {
		return true;
		}
		return false;
	}

	@Override
	public boolean compareFinalParametrsOfCar(CarBuilder builder) {
		if (this.getModel().equals(builder.getModel()) &&		
			this.getEngine().equals(builder.getEngine()) &&
			this.getCargo().equals(builder.getCargo())
		) {
		return true;
		}
		return false;
	}
	
	public Cargo getCargo() {
		return cargo;
	}

	@Override
	public String toString() {
		return "CargoCar " + "Груз = " + cargo + super.toString();
	}	

}
