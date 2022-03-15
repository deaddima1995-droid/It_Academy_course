package homework.project.data;

import java.util.ArrayList;
import java.util.List;

import homework.project.data.car.Car;

public class Storage <T extends Car>{
	List<T> storage = new ArrayList<>();

	public Storage() {
		
	}
	
	public void addToStorage(T car) {
		storage.add(car);
	}

	@Override
	public String toString() {
		return "Storage [storage=" + storage + "]";
	}
	
	

}
