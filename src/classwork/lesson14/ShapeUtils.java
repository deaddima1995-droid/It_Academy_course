package classwork.lesson14;

import java.util.List;

import classwork.lesson14.shapes.Shape;

public class ShapeUtils {
	public static double getAllVolume(List<? extends Shape> list) {
		double out = 0;
		for (Shape shape : list) {
			try {
				out += shape.getValue();
			} catch (UnsupportedOperationException e) {
				System.err.printf("Somethins not support: %s", e.getMessage());
			}
		}
		return out;
		
	}
}
