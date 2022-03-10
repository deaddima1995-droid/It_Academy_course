package classwork.lesson10;

import java.util.concurrent.atomic.AtomicBoolean;

import classwork.strin.Box;

public class BoxSeller {
	private final AtomicBoolean stopFlag;
	private final Storage<Box> st;
	
	public void sellBox() {
		while(!stopFlag.get()) {
			Box box = st.getFromStorage();
			if (box != null) {
				System.out.println("Коробку продали!!!: "+box);
			} else {
				System.out.println("Нет товара - нет денег!");
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				stopFlag.set(true);
			}
		}
	}
	
	public BoxSeller(AtomicBoolean stopFlag, Storage<Box> st) {
		super();
		this.stopFlag = stopFlag;
		this.st = st;
	}
}
