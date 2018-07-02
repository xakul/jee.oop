package org.state;

public class RoboticStandBy implements RoboticState {

	private final Robot robot;

	public RoboticStandBy(Robot robot){
		this.robot = robot;
	}
	/**
	 * Runtime da buraya düşüldüğünde robotun durumu beklemededir.
	 */
	/**
	 * If you are in this class at runtime robot is waiting for the Take() action.
	 */
	public void take() {
		System.out.println("Taking the pallet.");
		robot.setRoboticState(robot.getRoboticTake());
	}
	public void Standby() {
		System.out.println("Standby..");
	}
	public void put() {
		System.out.println("There is no pallet on forklift.");
	}
}
