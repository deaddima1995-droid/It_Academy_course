package homework.project.data.service;

import java.util.Set;

import homework.project.data.car.Car;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.interfaces_project.OptionChangeble;

public class OptionServise implements OptionChangeble {

	@Override
	public <T extends Car> void addOption(T car, Set<Option> options) {
		car.addOption(options);
	}

	@Override
	public <T extends Car> void addOption(T car, Option... options) {
		car.addOption(options);
	}

	@Override
	public <T extends Car> void deleteOption(T car, Option... options) {
		car.deleteOption(options);
	}

}
