package homework.project.data.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import homework.project.data.car.Car;
import homework.project.data.car.CargoCar;
import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.data.car.car_data.realize_type.Cargo;
import homework.project.data.car.car_data.unchange_data.Engine;
import homework.project.data.car.car_data.unchange_data.Model;

public class CargoFactory {
	private final List<Cargo> storage;

	
	
	public CargoFactory() {
		super();
		this.storage = new ArrayList<Cargo>();
	}



	@Override
	public Car createCar(Color color, Model model, Wheel wheel, Engine engine, Set<Option> options, byte typeOfCar) {
		// TODO Auto-generated method stub
		return super.createCar(color, model, wheel, engine, options, typeOfCar);
	}



	

}
