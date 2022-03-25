package homework.project;

import homework.project.data.CarSaler;

import homework.project.data.car.car_data.change_data.*;
import homework.project.data.car.car_data.unchange_data.*;
import homework.project.data.factory.*;
import homework.project.data.service.*;
import homework.project.exception_project.NullParametrException;

public class Main {

	public static void main(String[] args) {
		ColorServise colorServise = new ColorServise();
		WheelServise wheelServise = new WheelServise();
		OptionServise optionServise = new OptionServise();
		
		RacingFactory raceFactory = new RacingFactory();
		CargoFactory cargoFactory = new CargoFactory();
		TrophyFactory trophyFactory = new TrophyFactory();
		
		CarSaler saler = new CarSaler(colorServise, wheelServise, optionServise, raceFactory, trophyFactory, cargoFactory);
		System.out.println(raceFactory);
		System.out.println(cargoFactory);
		System.out.println(trophyFactory+"\n");	
		
		try {
			saler.takeOrder(new CarBuilder(Color.BLUE, Model.CADDY, Wheel.R18, Engine.HIGH, new Option[] {Option.AUDIO, Option.BLUETOOTH} , Turbo.MAX));
			saler.takeOrder(new CarBuilder(Color.BLUE, Model.PASSAT, Wheel.R16, Engine.MEDIUM, new Option[] {Option.AUDIO, Option.BLUETOOTH, Option.CONDITIONER}, Drive.FULL));
			saler.takeOrder(new CarBuilder(Color.WHITE, Model.CADDY, Wheel.R19, Engine.HIGH, new Option[] { }, Cargo.EAT));
		} catch (NullParametrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println(raceFactory);
		System.out.println(cargoFactory);
		System.out.println(trophyFactory+"\n");	
		
	}

}
