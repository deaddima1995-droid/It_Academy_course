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
	private static final int MAX_ARMY = 2;
	private final List<Robot> army = new ArrayList<>();
	private volatile static Factory FACTORY = new Factory();
	private final Set<PartsOfRobot> storage = new HashSet<>();
	

	public static void main(String[] args) throws InterruptedException {
		Country papua = new Country("Папуасия");
		Country potatoes = new Country("Картофиляндия");
		Thread papuaThread = new Thread(papua);
		Thread potatoesThread = new Thread(potatoes);
		Thread factory = new Thread(FACTORY);
	
		
		
		factory.start();
		potatoesThread.start();
		papuaThread.start();
		factory.join();
		potatoesThread.join();
		papuaThread.join();
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println("Поток выполняется");
		}

		System.out.println("Поток закончился");
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
		while(army.size() <= MAX_ARMY) {
			checkFactoryAndCreateRobot();
		}
		System.out.println(this.name+" имеет "+MAX_ARMY+" роботов");
		
		
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

	public Integer getArmy() {
		return army.size();
	}
}
