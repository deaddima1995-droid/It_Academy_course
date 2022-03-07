package homework.task6.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import homework.task6.util.parts.PartsOfRobot;

public class Factory implements Runnable{
	Random rnd = new Random();
	private List<PartsOfRobot> storage = new ArrayList<>();
    	
	
	public void createRandomPartOfRobot() {
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
		while(true) {
			createRandomPartOfRobot();
			try {
				Thread.sleep(5000);
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
