package homework.task6;

import homework.task6.util.Country;
import homework.task6.util.Factory;
import homework.task6.util.parts.PartsOfRobot;


public class Main {

	public static void main(String[] args) {
		Country belarus = new Country();
		Country russia = new Country();
		Factory factory = new Factory();
		for (int i = 0; i < 3; i++) {
			factory.createRandomPartOfRobot();			
		}
		
		PartsOfRobot foot = factory.takePartOfRobot(PartsOfRobot.FOOT_LEFT);
		System.out.println(factory);
		System.out.println(foot.name());	
		
	}

}
