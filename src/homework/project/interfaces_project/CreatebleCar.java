package homework.project.interfaces_project;

import java.util.Set;

import homework.project.data.car.Car;
import homework.project.data.car.car_data.change_data.Color;
import homework.project.data.car.car_data.change_data.Option;
import homework.project.data.car.car_data.change_data.Wheel;
import homework.project.data.car.car_data.unchange_data.Engine;
import homework.project.data.car.car_data.unchange_data.Model;


public interface CreatebleCar {
	
	public <T extends Car> T createCar(Color color, Model model, int year, Wheel wheel, Engine engine, Set<Option> options, byte typeOfCar);
}
