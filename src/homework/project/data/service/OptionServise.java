package homework.project.data.service;

import java.util.Set;

import homework.project.data.car.Car;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.interfaces.OptionChangeble;

public class OptionServise implements OptionChangeble {
	
	public <T extends Car> void addOption (T car, Set<Option> options) {
		car.addOption(options);
	}
	
	public <T extends Car> void deleteOption (T car, Set<Option> options) {
		car.deleteOption(options);
	}
}
