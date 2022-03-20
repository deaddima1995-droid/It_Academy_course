package homework.project.interfaces;

import java.util.Set;

import homework.project.data.car.Car;
import homework.project.data.car.car_data.change_data.Option;

public interface OptionChangeble {
	public <T extends Car> void addOption (T car, Set<Option> options);
	
	public <T extends Car> void deleteOption (T car, Set<Option> options);
}
