package classwork.lesson14.shapes;

public class Sphere extends Shape3D {

	private final double raduis;
	private double mass;
	
	public Sphere(String name, double raduis, double mass) {
		super(name);
		this.raduis = raduis;
		this.mass = mass;
	}
	
	public Sphere(String name, double raduis) {
		super(name);
		this.raduis = raduis;
	}

	@Override
	public int getRib() {
		return 0;
	}
	
	@Override
	public double getValue() {
		
		return 300;
	}
	
	
}
