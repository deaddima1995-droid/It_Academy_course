package homework.project.data.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import homework.project.data.car.Car;
import homework.project.data.car.RacingCar;
import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.data.car.car_data.realize_type.Turbo;
import homework.project.data.car.car_data.unchange_data.Engine;
import homework.project.data.car.car_data.unchange_data.Model;

public class RacingFactory extends Factory {
	private final static Random RND = new Random();
	private final List<RacingCar> storage = new ArrayList<RacingCar>();


	public RacingFactory() {
		super();
		for (int i = 0; i < 10; i++) {
			storage.add(createRandomCar());
		}
	}


	@Override
	public RacingCar createCar(Color color, Model model, Wheel wheel, Engine engine, Set<Option> options, byte typeOfCar) {
		
		return new RacingCar (color, model, wheel, engine, options, null);
	}
	

	@Override
	public RacingCar createRandomCar() {
		return createCar(
				Color.values()[RND.nextInt(Color.values().length)], 
				Model.values()[RND.nextInt(Model.values().length)], 
				Wheel.values()[RND.nextInt(Wheel.values().length)], 
				Engine.values()[RND.nextInt(Engine.values().length)], 
				null, 
				(byte)0);
	}

	
	@Override
	public String toString() {
		return "RacingFactory [storage=" + storage + "]";
	}

	


	

	




	

}
