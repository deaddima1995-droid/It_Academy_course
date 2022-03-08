package homework.task6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import homework.task6.util.Factory;
import homework.task6.util.PartsOfRobot;
import homework.task6.util.Robot;



public class Country implements Runnable{
	private final String name;
	private final List<Robot> army = new ArrayList<>();
	private volatile static Factory FACTORY = new Factory();
	private final Set<PartsOfRobot> storage = new HashSet<>();
	

	public static void main(String[] args) {
		Thread russia = new Thread(new Country("Russia"));
		Thread usa = new Thread(new Country("USA"));
		Thread factory = new Thread(FACTORY);
		
		factory.start();
		usa.start();
		russia.start();
		
	}
	
	public void checkFactoryAndCreateRobot() {
		synchronized (FACTORY) {
			FACTORY.getPartOfRobot(this);
			if (storage.size() == 6) {
				army.add(new Robot());
				System.out.println(this.name+" создала робота");
				storage.clear();
			}
			FACTORY.notify();
		}
	}
	
	@Override
	public void run() {
		while(army.size() != 20) {
		//System.out.println(this.name+" старт");
		checkFactoryAndCreateRobot();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println(this.name+" имеет 20 роботов");
		
	}

	public Country(String name) {
		super();
		this.name = name;
	}
	
	public Set<PartsOfRobot> getSetStorage() {
		return storage;
	}
	
	public void addToStoragePartsOfRobot(Set<PartsOfRobot> setParts) {
		storage.addAll(setParts);
	}

	public String getName() {
		return name;
	}
}
