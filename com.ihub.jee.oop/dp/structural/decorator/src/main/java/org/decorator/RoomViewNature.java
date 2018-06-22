package org.decorator;

public class RoomViewNature extends RoomDecorator {

	public RoomViewNature(Room r) {
		super(r);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		
		System.out.println("Doğa manzaralı oda seçildi.");
	}

}
