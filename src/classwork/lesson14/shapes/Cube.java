package classwork.lesson14.shapes;

public class Cube extends Shape3D {

	private final Square square;

	public Cube(String name, Square square) {
		super(name);
		this.square = square;
	}

	@Override
	public int getRib() {
		return 12;
	}
	
	@Override
	public double getValue() {
		
		return getRib() + 300;
	}
}
