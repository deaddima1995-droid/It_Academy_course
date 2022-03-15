package homework.project.data.car;

import java.util.Set;

import homework.project.data.car.car_data.*;


public class RacingCar extends Car {
	private Turbo turbo;

	public RacingCar(
			Color color, 
			Model model, 
			int year, 
			Wheel wheel, 
			Engine engine, 
			Set<Option> options,
			Turbo turbo
	) {
		super(color, model, year, wheel, engine, options);
		this.turbo = turbo;
	}

	@Override
	public String toString() {
		return "RacingCar [" + (turbo != null ? "turbo=" + turbo + ", " : "")
				+ (super.toString() != null ? "toString()=" + super.toString() : "") + "]";
	}

	public Turbo getTurbo() {
		return turbo;
	}
	
	public <T extends Car> T createCar(T car) {
		return (T) new RacingCar(null,null,2021,null,null,null, null);
	}

	public void setTurbo(Turbo turbo) {
		this.turbo = turbo;
	}
	
	
	
}
