package state;

public class RoboticPut implements RoboticState {
	
	private final Robot robot;

	public RoboticPut(Robot robot){
		this.robot = robot;
	}
	/**
	 * Runtime da buraya düşüldüğünde robotun durumu paleti yerleştirmiş konumdadır.
	 */
	/*
	 * If you are in this class at runtime robot already put pallet to the shelf and waiting for the Standby() action.
	 */
	public void take() {
		System.out.println("Robot must go standby mode.");
	}

	public void Standby() {
		System.out.println("Standby..");
		robot.setRoboticState(robot.getRoboticStandby());
	}

	public void put() {
		System.out.println("There is no pallet on forklift.");
	}
}
