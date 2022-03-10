package homework.task6;

import java.util.concurrent.atomic.AtomicBoolean;

import homework.task6.data.*;

public class Start {

	public static void main(String[] args) throws InterruptedException {
		AtomicBoolean stopFlag = new AtomicBoolean(false);
		final int MAX_ARMY = 20;
		final int TIME = 1;

		Factory factory = new Factory(stopFlag, TIME);
		Country yganda = new Country(stopFlag, "Уганда", factory, MAX_ARMY);
		Country papuasia = new Country(stopFlag, "Папуасия", factory, MAX_ARMY);

		Thread factoryThread = new Thread(factory::createRandomPartOfRobot);
		Thread ygandaThread = new Thread(yganda);
		Thread papuasiaThread = new Thread(papuasia);

		factoryThread.start();
		ygandaThread.start();
		papuasiaThread.start();

		factoryThread.join();
		ygandaThread.join();
		papuasiaThread.join();

		if (yganda.getArmy() > papuasia.getArmy()) {
			System.out.println("Уганда победила");
		} else if (yganda.getArmy() < papuasia.getArmy()) {
			System.out.println("Папуасы победили");
		} else {
			System.out.println("Мой код херня");
		}

	}

}
