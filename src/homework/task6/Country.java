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
	

	public static void main(String[] args) {
		Thread russia = new Thread(new Country("Russia"));
		Thread usa = 	new Thread(new Country("USA"));
		FACTORY.run();
		System.out.println(FACTORY);
		usa.start();
		russia.start();
	}
	
	public void addRobot() {
		this.army.add(new Robot());
	}
	
	@Override
	public void run() {
		System.out.println(this.name+" старт");
		this.addRobot();
		System.out.println(this.army);
	}

	public Country(String name) {
		super();
		this.name = name;
	}
}
