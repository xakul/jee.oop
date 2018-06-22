package org.bridge;

public class Square extends FormBolt {

	public Square(RadiusBolt r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyRadius() {
		System.out.print("Hexagonal Bolt üretildi çapı ");
		radiusBolt.applyRadius();
	}

}
