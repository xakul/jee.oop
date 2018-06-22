package org.decorator;

public class KingRoom extends RoomDecorator {

	/**
	 * King room extend from RoomDecorator Decorator class. Giving the Room object to King Room as a parameter
	 * 
	 */
	public KingRoom(Room r) {
		super(r);
	}
	
	
	/**
	 * We override assemble method for KingRoom.
	 * 
	 */
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("King room selected.");
		
	}

}
