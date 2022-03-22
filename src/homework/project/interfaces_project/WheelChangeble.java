package homework.project.interfaces_project;

import homework.project.data.car.Car;
import homework.project.data.car.car_data.change_data.Wheel;

public interface WheelChangeble {
	
	public <T extends Car> void changeWheel(T car, Wheel wheel);
}
