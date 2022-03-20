package homework.project.data.interface_project;

import homework.project.data.car.Car;
import homework.project.data.car.car_data.change_data.Color;

public interface ColorChangeble {
	
	public <T extends Car> void changeColor(T car, Color color);
}
