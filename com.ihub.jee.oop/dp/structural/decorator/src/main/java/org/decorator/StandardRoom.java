package org.decorator;

public class StandardRoom implements Room {

	/**
	 * We override assemble method for StandardRoom.
	 * 
	 */
	public void assemble() {
		System.out.print("Standard Room Reserved.");
	}

}
