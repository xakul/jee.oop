package org.bridge;

public class Hexagonal extends FormBolt {

	public Hexagonal(RadiusBolt r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyRadius() {
		System.out.print("Hexagonal Bolt üretildi çapı ");
		radiusBolt.applyRadius();
	}

}
