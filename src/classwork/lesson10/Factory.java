package classwork.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

import classwork.strin.Box;

public class Factory {
	private static final Random rnd = new Random();
	private final AtomicBoolean stopFlag;
	private final Storage<Box> st;
	
	
	
	public Factory(AtomicBoolean stopFlag, Storage<Box> st) {
		super();
		this.stopFlag = stopFlag;
		this.st = st;
	}

	public void createBoxes() {
		while(!stopFlag.get()) {
			st.addToStorage(createfiveBoxes());
			System.out.println("Создали коробку");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				stopFlag.set(true);
			}
		}
	}
	
	
	private List<Box> createfiveBoxes() {
		List<Box> result = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			result.add(new Box(
					rnd.nextInt(10),
					rnd.nextInt(10),
					rnd.nextInt(10)
					));
		}
		return result;
	}
}
