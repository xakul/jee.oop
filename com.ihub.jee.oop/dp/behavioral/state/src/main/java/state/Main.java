package state;

public class Main {
	public static void main(String[] args) {
		/**
		 * Burada robotumuza istediğimiz askiyonları vererek hiç bir if ve ya herhangi bir
		 * condition kullanmadan sürecimizin devam ettiğini göreceğiz.
		 */
		/**
		 * We will see the actions of the robot.We didnt use any if or conditions 
		 * and our progress is still going perfectly by this pattern.
		 */
		Robot robot = new Robot();
		robot.take();
		robot.Standby();
		robot.take();
		robot.put();
		
		robot.take();
		robot.put();
		robot.put();
		
		robot.Standby();
		robot.Standby();
	}
}
