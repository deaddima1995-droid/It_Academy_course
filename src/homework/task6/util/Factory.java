package homework.task6.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;

import homework.task6.Country;

public class Factory implements Runnable{
	private Random rnd = new Random();
	private volatile ArrayList<PartsOfRobot> storage = new ArrayList<>();
    	
	
	private void createRandomPartOfRobot() {
		int index = rnd.nextInt(PartsOfRobot.values().length);
		storage.add(PartsOfRobot.values()[index]);
		System.out.println(this+" make "+PartsOfRobot.values()[index]);
	}
	
	public void getPartOfRobot(Country country) {
		Set<PartsOfRobot> setParts = country.getSetStorage();
		List<PartsOfRobot> removingList = new ArrayList<>();
		synchronized (storage) {
			if (!storage.isEmpty()) {
				for (PartsOfRobot partsOfRobot : storage) {
					if (!setParts.contains(partsOfRobot)) {
						setParts.add(partsOfRobot);
						removingList.add(partsOfRobot);
						System.out.println(country.getName()+" получила: "+partsOfRobot);
					}	
				}		
			}
			for (PartsOfRobot partsOfRobot : removingList) {
				storage.remove(partsOfRobot);
			}
			country.addToStoragePartsOfRobot(setParts);	
		}
		notifyAll();
		}

	@Override
	public void run() {
		while(true) {
			try {
				synchronized (storage) {
					createRandomPartOfRobot();
				}
				Thread.sleep(100);
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
