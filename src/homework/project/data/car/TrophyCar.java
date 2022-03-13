package homework.project.data.car;

import java.util.Set;

import homework.project.data.car.car_data.*;
;

public class TrophyCar extends Car {
	private Drive drive;

	public TrophyCar(Color color, Model model, int year, Wheel wheel, Engine engine, Set<Option> options, Drive drive) {
		super(color, model, year, wheel, engine, options);
		this.drive = drive;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TrophyCar [" + (drive != null ? "drive=" + drive + ", " : "")
				+ (super.toString() != null ? "toString()=" + super.toString() : "") + "]";
	}
	
	
	

}
