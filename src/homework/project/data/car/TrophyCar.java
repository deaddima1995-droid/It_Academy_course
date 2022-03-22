package homework.project.data.car;

import java.util.Set;

import homework.project.data.car.car_data.*;
import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.data.car.car_data.realize_type.Drive;
import homework.project.data.car.car_data.unchange_data.Engine;
import homework.project.data.car.car_data.unchange_data.Model;
import homework.project.data.factory.CarBuilder;
;

public class TrophyCar extends Car {
	private final Drive drive;

	public TrophyCar(Color color, Model model, Wheel wheel, Engine engine, Set<Option> options, Drive drive) {
		super(color, model, wheel, engine, options);
		this.drive = drive;
		
	}
	
	@Override
	public boolean compareAllParametrsOfCar(CarBuilder builder) {
		
		if (this.getColor().equals(builder.getColor()) &&
			this.getModel().equals(builder.getModel()) &&
			this.getWheel().equals(builder.getWheel()) &&
			this.getEngine().equals(builder.getEngine()) &&
			this.getOptions().containsAll(builder.getOptions()) &&
			this.getDrive().equals(builder.getDrive())
			) {
				return true;
			}
		return false;
	}
	
	@Override
	public boolean compareFinalParametrsOfCar(CarBuilder builder) {
		
		if (this.getModel().equals(builder.getModel()) &&		
			this.getEngine().equals(builder.getEngine()) &&
			this.getDrive().equals(builder.getDrive())
		) {
		return true;
		}
		return false;
	}
	

	public Drive getDrive() {
		return drive;
	}

	@Override
	public String toString() {
		return "TrophyCar " + "Тип привода = " + drive + super.toString();
	}
	
}
