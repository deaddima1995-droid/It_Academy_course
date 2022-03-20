package homework.project;

import homework.project.data.CarSaler;
import homework.project.data.car.Car;
import homework.project.data.car.RacingCar;
import homework.project.data.car.TrophyCar;
import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.data.car.car_data.realize_type.Turbo;
import homework.project.data.car.car_data.unchange_data.Engine;
import homework.project.data.car.car_data.unchange_data.Model;
import homework.project.data.factory.CarBuilder;
import homework.project.data.factory.CargoFactory;
import homework.project.data.factory.RacingFactory;
import homework.project.data.factory.TrophyFactory;
import homework.project.data.service.ColorServise;
import homework.project.data.service.OptionServise;
import homework.project.data.service.Service;
import homework.project.data.service.WheelServise;
import homework.task2.addition.Box;

public class Main {

	public static void main(String[] args) {
		ColorServise colorServise = new ColorServise();
		WheelServise wheelServise = new WheelServise();
		OptionServise optionServise = new OptionServise();
		
		RacingFactory raceFactory = new RacingFactory();
		CargoFactory cargoFactory = new CargoFactory();
		TrophyFactory trophyFactory = new TrophyFactory();
		
		CarSaler saler = new CarSaler(colorServise, wheelServise, optionServise, raceFactory, trophyFactory, cargoFactory);
		Car car = saler.takeOrder(new CarBuilder(Color.BLUE, Model.CADDY, 2022, Wheel.R18, Engine.HIGH, null, Turbo.MAX));
		saler.addCarToStorage(car);
		raceFactory.addCar(car);
		System.out.println((RacingCar) car);
		saler.changeColorCar(car, Color.BLACK);
		System.out.println(raceFactory);
		
	}

}
