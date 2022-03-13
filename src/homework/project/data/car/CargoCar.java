package homework.project.data.car;

import java.util.Set;

import homework.project.data.car.car_data.*;

public class CargoCar extends Car {
	private Cargo cargo;
	
	public CargoCar(Color color, Model model, int year, Wheel wheel, Engine engine, Set<Option> options, Cargo cargo) {
		super(color, model, year, wheel, engine, options);
		this.cargo = cargo;
		// TODO Auto-generated constructor stub
	}

}
