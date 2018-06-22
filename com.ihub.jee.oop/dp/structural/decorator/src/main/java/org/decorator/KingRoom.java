package org.decorator;

public class KingRoom extends RoomDecorator {

	public KingRoom(Room r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		super.assemble();
		System.out.println("King room selected.");
		
	}

}
