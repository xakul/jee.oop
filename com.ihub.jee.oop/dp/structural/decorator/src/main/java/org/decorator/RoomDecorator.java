package org.decorator;

public class RoomDecorator implements Room {

	protected Room room;
	
	/**
	 * Giving the Room object to RoomDecorator as a parameter
	 * 
	 */
	public RoomDecorator(Room r) {
		this.room = r;
	}
	
	public void assemble() {
		this.room.assemble();
	}

}
