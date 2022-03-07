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


	@Override
	public void run() {
		createRandomPartOfRobot();
	}
}
