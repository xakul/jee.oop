package org.decorator;

public class Main {

	public static void main(String[] args) {
		/**
		 * We select Deluxe room with sea view.
		 * 
		 */
		Room seaViewDeluxe = new DeluxeRoom(new RoomViewSea(new StandardRoom()));
		seaViewDeluxe.assemble();

		/**
		 * We select King room with nature view.
		 * 
		 */
		Room natureViewKing = new KingRoom(new RoomViewNature(new StandardRoom()));
		natureViewKing.assemble();
	}

}
