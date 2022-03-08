package homework.task6.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import homework.task6.Country;

public class Factory implements Runnable{
	private Random rnd = new Random();
	private List<PartsOfRobot> storage = new ArrayList<>();
    	
	
	private void createRandomPartOfRobot() {
		int index = rnd.nextInt(PartsOfRobot.values().length);
		storage.add(PartsOfRobot.values()[index]);
		System.out.println(this+" make "+PartsOfRobot.values()[index]);
	}
	
	public void getPartOfRobot(Country country) {
		Set<PartsOfRobot> setParts = country.getSetStorage();
		List<PartsOfRobot> removingList = new ArrayList<>();
		if (!storage.isEmpty()) {
			for (PartsOfRobot partsOfRobot : storage) {
				if (!setParts.contains(partsOfRobot)) {
					removingList.add(partsOfRobot);
					setParts.add(partsOfRobot);
					System.out.println(country.getName()+" получила: "+partsOfRobot.name());
				} 
			}
			storage.removeAll(removingList);
		} else {
			System.out.println(country.getName()+" ничего не получила");
		}
		country.addToStoragePartsOfRobot(setParts);
	}

	@Override
	public void run() {
		while(true) {
			try {
				createRandomPartOfRobot();
				Thread.sleep(1000);
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
