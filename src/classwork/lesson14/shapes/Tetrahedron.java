package classwork.lesson14.shapes;

public class Tetrahedron extends Shape3D {
	private final Triangular triangular;
	private final int hight;
	
	public Tetrahedron(String name, Triangular triangular, int hight) {
		super(name);
		this.triangular = triangular;
		this.hight = hight;
	}

	@Override
	public int getRib() {
		return 6;
	}

	@Override
	public double getValue() {
		
		return getRib() + 300;
	}

} 
