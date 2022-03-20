package homework.project.data;



import java.util.ArrayList;
import java.util.List;

import homework.project.data.car.Car;
import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.data.factory.CarBuilder;
import homework.project.data.factory.CargoFactory;
import homework.project.data.factory.RacingFactory;
import homework.project.data.factory.TrophyFactory;
import homework.project.data.service.ColorServise;
import homework.project.data.service.OptionServise;
import homework.project.data.service.WheelServise;

public class CarSaler {

	private final ColorServise painter; 
	private final WheelServise pitStop;
	private final RacingFactory racingFactory;
	private final TrophyFactory trophyFactory;
	private final CargoFactory cargoFactory;
	private final List<Car> storage = new ArrayList<>();
	
	public CarSaler(ColorServise painter, 
			WheelServise pitStop, 
			OptionServise optionServise, 
			RacingFactory racingFactory,
			TrophyFactory trophyFactory,
			CargoFactory cargoFactory		
	) {
		this.painter = painter;
		this.pitStop = pitStop;
		this.racingFactory = racingFactory;
		this.trophyFactory = trophyFactory;
		this.cargoFactory = cargoFactory;
	}

	public Car takeOrder(CarBuilder builder) {
		if (builder.getType().equals("RacingCar")) {
			return racingFactory.createCar(builder);
		}
		if (builder.getType().equals("CargoCar")) {
			return cargoFactory.createCar(builder);
		}
		if (builder.getType().equals("TrophyCar")) {
			return trophyFactory.createCar(builder);
		}
		return null;
	}
	
	public void addCarToStorage(Car car) {
		storage.add(car);
	}

	public void changeColorCar(Car car, Color color) {
		painter.changeColor(car, color);
	}
	
	public void changeWheelCar(Car car, Wheel wheel) {
		pitStop.changeWheel(car, wheel);
	}
}
