package homework.project.data.car;

import java.util.Set;

import homework.project.data.car.car_data.*;
import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.data.car.car_data.realize_type.Cargo;
import homework.project.data.car.car_data.unchange_data.Engine;
import homework.project.data.car.car_data.unchange_data.Model;

public class CargoCar extends Car {
	private Cargo cargo;
	
	public CargoCar(Color color, Model model, Wheel wheel, Engine engine, Set<Option> options, Cargo cargo) {
		super(color, model, wheel, engine, options);
		this.cargo = cargo;
		// TODO Auto-generated constructor stub
	}

}
