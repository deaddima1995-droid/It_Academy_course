package classwork.lesson9;

public class Car {
	private final String name;
	private final CarModel carmodel;
	private final EngineCapacity engineCapacity;
	
	@Override
	public String toString() {
		return String.format("\n<%s> : <%s> : %s",name,carmodel,engineCapacity);
		}

	public String getName() {
		return name;
	}

	public CarModel getCarmodel() {
		return carmodel;
	}

	public EngineCapacity getEngineCapacity() {
		return engineCapacity;
	}

	public Car(String name, CarModel carmodel, EngineCapacity engineCapacity) {
		super();
		this.name = name;
		this.carmodel = carmodel;
		this.engineCapacity = engineCapacity;
	}
	
	
}
