package org.decorator;

public class DeluxeRoom extends RoomDecorator {

	public DeluxeRoom(Room r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		super.assemble();
		
		System.out.println("Deluxe oda seçildi.");
	}

}
