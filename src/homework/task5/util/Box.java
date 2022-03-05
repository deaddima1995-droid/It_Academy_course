package homework.task5.util;

import java.io.Serializable;
import java.util.Random;

public class Box implements Serializable{
	 private final int x;
	 private final int y;
	 private final int z;
	 private final int value;
	 
	 public Box(int x, int y, int z) {
			super();
			this.x = x;
			this.y = y;
			this.z = z;
			this.value = x * y * z;
		}
	 public Box() {
		 Random rnd = new Random();
		 this.x = rnd.nextInt(1,10);
		 this.y = rnd.nextInt(1,10);
		 this.z = rnd.nextInt(1,10);
		 this.value = x * y * z;
	 }

	@Override
	public String toString() {
		return "Box [x=" + x + ", y=" + y + ", z=" + z + ", value=" + value + "]";
	}
	public int getValue() {
		return value;
	}
	 
}
