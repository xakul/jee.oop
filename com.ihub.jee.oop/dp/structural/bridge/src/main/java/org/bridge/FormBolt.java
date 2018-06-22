package org.bridge;

public abstract class FormBolt {
	protected RadiusBolt radiusBolt;
	
	public FormBolt(RadiusBolt r) {
		this.radiusBolt = r;
	}
	
	abstract public void applyRadius();
}

