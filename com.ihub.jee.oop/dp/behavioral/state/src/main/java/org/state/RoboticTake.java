package org.state;

public class RoboticTake implements RoboticState {
	private final Robot robot;

	public RoboticTake(Robot robot){
		this.robot = robot;
	}
	/**
	 * Runtime da buraya düşüldüğünde robotun durumu paleti almış
	 * ve Put() fonksiyonunu çağırması beklenmektedir.
	 */
	/**
	 * If you are in this class at runtime robot already take the pallet and waiting for the Put() action.
	 */
	public void take() {
		System.out.println("Cannot take the pallet it is already taken.");
	}

	public void Standby() {
		System.out.println("Cannot standby with the pallet.");
	}

	public void put() {
		robot.setState(robot.getRoboticPut());
		System.out.println("Putting pallet to shelf.");

	}

}
