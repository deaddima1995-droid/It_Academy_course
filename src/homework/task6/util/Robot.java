package homework.task6.util;

import homework.task6.util.parts.*;


public class Robot {
	private final int ID;
	private final FootLeft leftFoot
	private final Body body;
	private final Head head;
	private final Foot leftFoot;
	private final Foot rightFoot;
	
	public Robot(int iD, Body body, Head head, Foot leftFoot, Foot rightFoot) {
		super();
		ID = iD;
		this.body = body;
		this.head = head;
		this.leftFoot = leftFoot;
		leftFoot.equals(Foot.Left);
		this.rightFoot = rightFoot;
	}

	@Override
	public String toString() {
		return "Robot [ID=" + ID + ", body=" + body + ", head=" + head + ", leftFoot=" + leftFoot + ", rightFoot="
				+ rightFoot + "]";
	}
	
}
