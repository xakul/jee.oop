package org.decorator;

public class RoomViewSea extends RoomDecorator {

	/**
	 * RoomViewSea extend from RoomDecorator Decorator class. Giving the Room object to RoomViewSea as a parameter
	 * 
	 */
	public RoomViewSea(Room r) {
		super(r);
	}
	
	/**
	 * We override assemble method for RoomViewSea.
	 * 
	 */
	@Override
	public void assemble() {
		super.assemble();
		System.out.println(" Deniz manzaralı oda seçildi.");
	}

}
