package org.bridge;

public class Square extends FormBolt {

	/**
	 * Square extend from FormBolt . Giving the Room object to RadiusBolt as a parameter
	 * 
	 */
	public Square(RadiusBolt r) {
		super(r);
	}

	@Override
	public void applyRadius() {
		System.out.print("Hexagonal Bolt üretildi çapı ");
		radiusBolt.applyRadius();
	}

}
