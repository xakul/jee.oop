package org.decorator;

public class RoomViewSea extends RoomDecorator {

	public RoomViewSea(Room r) {
		super(r);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println(" Deniz manzaralı oda seçildi.");
	}

}
