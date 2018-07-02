package state;

public class Robot implements RoboticState {
	/**
	 * Yapılcak eylemler doğrultusunda instancelar alıyoruz.
	 */
	/**
	 * Getting instances for the actions.
	 */
	private RoboticState roboticTake;
	private RoboticState roboticStandby;
	private RoboticState roboticPut;
	/**
	 * Robotun durumu için instance alıyoruz.
	 */
	/**
	 * Getting instance for status of the robot.
	 */
	private RoboticState state;

	public Robot(){
		this.roboticTake = new RoboticTake(this);
		this.roboticStandby = new RoboticStandBy(this);
		this.roboticPut = new RoboticPut(this);

		this.state = roboticStandby;
	}

	public void setRoboticState(RoboticState state){
		this.state = state;
	}

	public void take() {
		state.take();
	}

	public void Standby() {
		state.Standby();

	}
	public void put() {
		state.put();
	}

	public RoboticState getRoboticTake() {
		return roboticTake;
	}

	public void setRoboticTake(RoboticState roboticTake) {
		this.roboticTake = roboticTake;
	}

	public RoboticState getRoboticStandby() {
		return roboticStandby;
	}

	public void setRoboticStandby(RoboticState roboticStandby) {
		this.roboticStandby = roboticStandby;
	}

	public RoboticState getRoboticPut() {
		return roboticPut;
	}

	public void setRoboticPut(RoboticState roboticPut) {
		this.roboticPut = roboticPut;
	}

	public RoboticState getState() {
		return state;
	}

	public void setState(RoboticState state) {
		this.state = state;
	}


}
