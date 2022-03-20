package homework.project.data.service;

import homework.project.data.car.Car;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.interfaces.WheelChangeble;

public class WheelServise implements WheelChangeble {
	
	public <T extends Car> void changeWheel(T car, Wheel wheel) {
		car.changeWheel(wheel);
	}
}
