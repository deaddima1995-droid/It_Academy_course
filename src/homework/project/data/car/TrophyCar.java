package homework.project.data.car;

import java.util.Set;

import homework.project.data.car.car_data.*;
import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.data.car.car_data.realize_type.Drive;
import homework.project.data.car.car_data.unchange_data.Engine;
import homework.project.data.car.car_data.unchange_data.Model;
;

public class TrophyCar extends Car {
	private Drive drive;

	public TrophyCar(Color color, Model model, Wheel wheel, Engine engine, Set<Option> options, Drive drive) {
		super(color, model, wheel, engine, options);
		this.drive = drive;
		
	}
	
	

	@Override
	public String toString() {
		return "TrophyCar [" + (drive != null ? "drive=" + drive + ", " : "")
				+ (super.toString() != null ? "toString()=" + super.toString() : "") + "]";
	}
	
	
	

}
