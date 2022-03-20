package classwork.lesson12;

public class Box extends AbstractBox implements Printable {
	
	private String type;
	
	public String size = "big";

	public Box(int x, int y, int z) {
		super(x, y, z);
		type = "box";
	}

	@Override
	public void print() {
		System.out.printf("Box{x: %s, y: %s, z: %s, type: %s",x, y, z, type);
	}
	
	public void printNameWithPrefix(String pref) {
		System.out.println(pref + name);
	}
	
	private String getSize() {
		return size;
	}
	
	public String getType() {
		return type;
	}
	
	public int getValue() {
		return x * y * z;
	}

	@Override
	public String toString() {
		return String.format("Box{x: %s, y: %s, z: %s, type: %s", x, y, z, type);
	}
	
	

}
