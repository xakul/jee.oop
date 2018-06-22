package org.decorator;

public class RoomDecorator implements Room {

	protected Room room;
	
	public RoomDecorator(Room r) {
		this.room = r;
	}
	
	public void assemble() {
		this.room.assemble();
	}

}
