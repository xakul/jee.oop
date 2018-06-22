package org.decorator;

public class DeluxeRoom extends RoomDecorator {

	/**
	 * Deluxe room extend from RoomDecorator Decorator class. Giving the Room object to Deluxe Room as a parameter
	 * 
	 */
	public DeluxeRoom(Room r) {
		super(r);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		
		System.out.println("Deluxe oda seçildi.");
	}

}
