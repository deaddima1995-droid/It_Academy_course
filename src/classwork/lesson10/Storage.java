package classwork.lesson10;

import java.util.ArrayList;
import java.util.List;

public class Storage <T>{
	private final List<T> storage = new ArrayList<>();
	
	public void addToStorage(List<T> element) {
		synchronized (storage) {
			storage.addAll(element);
		}
	}
	
	public T getFromStorage() {
		synchronized (storage) {
			if (!storage.isEmpty()) {
				return storage.remove(0);
			}
		}
		return null;
	}
}
