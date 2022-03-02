package classwork.lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import classwork.strin.Box;

public class Main {
	private static final List<Box> BOXES = new ArrayList<>();
	private static final Random RANDOM = new Random();
	
	public static void main(String[] args) throws InterruptedException {
		Thread first = new Thread(Main::madeSomething);
		Thread second = new Thread(Main::madeSomething);
		first.start();
		second.start();
		first.join();
		second.join();
		System.out.println(BOXES);
		System.out.println("Done");
		
	}
	
	public static void madeSomething() {
		
		List<Box> createdBoxes = createTenBox();
		synchronized (BOXES) {
		BOXES.addAll(createdBoxes);
		}
	}
	
	public static List<Box> createTenBox() {
		List<Box> listBox = new ArrayList<>();
		for(int i = 0; i < 10 ; i++) {
			listBox.add(
					new Box (
								RANDOM.nextInt(10),
								RANDOM.nextInt(10),
								RANDOM.nextInt(10)
						));
		}
		return listBox;
	}

}
