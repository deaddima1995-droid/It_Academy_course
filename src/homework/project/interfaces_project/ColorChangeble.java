package homework.project.interfaces_project;

import homework.project.data.car.Car;
import homework.project.data.car.car_data.change_data.Color;

public interface ColorChangeble {

	public <T extends Car> void changeColor(T car, Color color);

}
