package homework.project.data.service;

import homework.project.data.car.Car;
import homework.project.data.car.car_data.change_data.Color;
import homework.project.interfaces_project.ColorChangeble;

public class ColorServise implements ColorChangeble{
	
	public <T extends Car> void changeColor(T car, Color color) {
		car.changeColor(color);
	}
}
