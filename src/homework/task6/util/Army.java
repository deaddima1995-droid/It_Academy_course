package homework.task6.util;

import java.util.ArrayList;
import java.util.List;

public class Army {
	private final List<Robot> robotPart;

	private Army() {
		super();
		this.robotPart = new ArrayList<>();
	}
	
	public void createArmy() {
		this = new Army();
	}
	
}
