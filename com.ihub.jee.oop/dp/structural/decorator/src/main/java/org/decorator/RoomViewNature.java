package org.decorator;

public class RoomViewNature extends RoomDecorator {

	/**
	 * RoomViewNature extend from RoomDecorator Decorator class. Giving the Room object to RoomViewNature as a parameter
	 * 
	 */
	public RoomViewNature(Room r) {
		super(r);
	}
	
	/**
	 * We override assemble method for RoomViewNature.
	 * 
	 */
	@Override
	public void assemble() {
		super.assemble();
		
		System.out.println("Doğa manzaralı oda seçildi.");
	}

}
