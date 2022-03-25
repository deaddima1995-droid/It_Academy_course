package classwork.lesson14;

import classwork.lesson14.shapes.Shape;

public class Wrapper<T extends Shape> {
	private T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public Wrapper(T object) {
		this.object = object;
	}
}
