package homework.task6.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Factory implements Runnable{
	private Random rnd = new Random();
	private List<PartsOfRobot> storage = new ArrayList<>();
    	
	
	private void createRandomPartOfRobot() {
		int index = rnd.nextInt(PartsOfRobot.values().length);
		storage.add(PartsOfRobot.values()[index]);
	}
	
	public PartsOfRobot takePartOfRobot(PartsOfRobot parts) {
		if (!storage.isEmpty()) {
			for (PartsOfRobot partsOfRobot : storage) {
				if (partsOfRobot.equals(parts)) {
					storage.remove(partsOfRobot);
					return partsOfRobot;
				}
			}
		}
		return null;
	}

	@Override
	public void run() {
		int i = 0;
		while(i < 100) {	
			try {
				createRandomPartOfRobot();
				i++;
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toString() {
		return "Factory [storage=" + storage + "]";
	}
	
	
}
