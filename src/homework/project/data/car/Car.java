package homework.project.data.car;

import java.util.Set;

import homework.project.data.car.car_data.*;


public class Car {
	private Color color;
	private final Model model;
	private final int year;
	private Wheel wheel;
	private final Engine engine;
	private final Set<Option> options;
	/**
	 * @param color
	 * @param model
	 * @param year
	 * @param wheel
	 * @param engine
	 * @param options
	 */
	protected Car(
			Color color, 
			Model model, 
			int year, 
			Wheel wheel, 
			Engine engine, 
			Set<Option> options
	) {
		this.color = color;
		this.model = model;
		this.year = year;
		this.wheel = wheel;
		this.engine = engine;
		this.options = options;
	}
	
	public void changeColor(Color color) {
		this.color = color;
	}
	
	public <T extends Car> T createCar(T car) {
		return (T) new Car(null,null,2020,null,null,null);
	}
	
	public void changeWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	public void changeOption(Set<Option> options, boolean add) {
		if (add) {
			this.options.addAll(options);
			return;
		}
		this.options.removeAll(options);
	}

	@Override
	public String toString() {
		return "Car [" + (color != null ? "color=" + color + ", " : "") + (model != null ? "model=" + model + ", " : "")
				+ "year=" + year + ", " + (wheel != null ? "wheel=" + wheel + ", " : "")
				+ (engine != null ? "engine=" + engine + ", " : "") + (options != null ? "options=" + options : "")
				+ "]";
	}
	
	
}
