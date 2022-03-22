package homework.project.data;

import java.util.Set;

import homework.project.data.car.Car;
import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Option;
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
	private final OptionServise optionServise;
	
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
		this.optionServise = optionServise;
	}

	public Car takeOrder(CarBuilder builder) {
		System.out.println("Взяли заказ "+builder);
		if (builder.getType().equals("RacingCar")) {
			return racingFactory.takeCarFromFactoryOrCreateHim(builder);
		}
		if (builder.getType().equals("CargoCar")) {
			return cargoFactory.takeCarFromFactoryOrCreateHim(builder);
		}
		if (builder.getType().equals("TrophyCar")) {
			return trophyFactory.takeCarFromFactoryOrCreateHim(builder);
		}
		return null;
	}
	
	public void changeColorCar(Car car, Color color) {
		painter.changeColor(car, color);
	}
	
	public void changeOptionCar(Car car, Option[] option) {
		this.optionServise.addOption(car, option);
	}
	
	public void deleteOptionCar(Car car, Set<Option> options) {
		this.optionServise.addOption(car, options);
	}
	
	public void changeWheelCar(Car car, Wheel wheel) {
		pitStop.changeWheel(car, wheel);
	}

}
