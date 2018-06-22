package org.decorator;

public class Main {

	public static void main(String[] args) {
		Room seaViewDeluxe = new DeluxeRoom(new RoomViewSea(new StandardRoom()));
		seaViewDeluxe.assemble();

		Room natureViewKing = new KingRoom(new RoomViewNature(new StandardRoom()));
		natureViewKing.assemble();
	}

}
