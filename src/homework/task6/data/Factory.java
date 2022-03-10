package homework.task6.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class Factory {
	private Random rnd = new Random();
	private final AtomicBoolean stopFlag;
	private int cycleTime;
	private ArrayList<PartsOfRobot> storage = new ArrayList<>();

	public Factory(AtomicBoolean stopFlag, int cycleTime) {
		this.stopFlag = stopFlag;
		this.cycleTime = cycleTime * 100;
	}

	public void createRandomPartOfRobot() {
		while (!stopFlag.get()) {
			int index = rnd.nextInt(PartsOfRobot.values().length);
			synchronized (storage) {
				storage.add(PartsOfRobot.values()[index]);
				System.out.println(this + " make " + PartsOfRobot.values()[index]);
			}
			try {
				Thread.sleep(cycleTime);
			} catch (InterruptedException e) {
				stopFlag.set(true);
			}
		}
	}

	public void setPartOfRobotToStorage(Set<PartsOfRobot> partSet, String name) {
		List<PartsOfRobot> removingList = new ArrayList<>();
		synchronized (storage) {
			if (!storage.isEmpty()) {
				for (PartsOfRobot partsOfRobot : this.storage) {
					if (!partSet.contains(partsOfRobot)) {
						partSet.add(partsOfRobot);
						removingList.add(partsOfRobot);

					}
				}
				if (!removingList.isEmpty()) {
					System.out.println(name + " получил: " + removingList);
				}
				for (PartsOfRobot partsOfRobot : removingList) {
					this.storage.remove(partsOfRobot);
				}
			}
		}
	}

	public void setStopFlag(AtomicBoolean flag) {
		this.stopFlag.set(flag.get());
	}

	public boolean getStopFlag() {
		return stopFlag.get();
	}

	@Override
	public String toString() {
		return "Factory [storage=" + storage + "]";
	}

}
