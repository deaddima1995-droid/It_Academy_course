package homework.task6.data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class Country implements Runnable {
	private final String name;
	private final AtomicBoolean stopFlag;
	private final Factory factory;
	private final int maxArmy;
	private final List<Robot> army = new ArrayList<>();
	private final Set<PartsOfRobot> storage = new HashSet<>();

	public Country(AtomicBoolean stopFlag, String name, Factory factory, int maxArmy) {
		super();
		this.stopFlag = stopFlag;
		this.maxArmy = maxArmy;
		this.factory = factory;
		this.name = name;
	}

	public void checkFactoryAndCreateRobot() {
		factory.setPartOfRobotToStorage(storage, this.name);
		if (storage.size() == 6) {
			army.add(new Robot());
			System.err.println(this.name + " создала робота " + this.army.size());
			storage.clear();
		}
	}

	public int getArmy() {
		return army.size();
	}

	@Override
	public void run() {
		while (!stopFlag.get()) {
			while (army.size() < maxArmy) {
				synchronized (factory) {
					if (factory.getStopFlag()) {
						break;
					}
				}
				checkFactoryAndCreateRobot();

			}
			stopFlag.set(true);
			factory.setStopFlag(stopFlag);
			System.out.println(this.name + " имеет " + this.army.size() + " роботов");
		}
	}
}
