package com.jabong.widget;

public class GridWidget implements Widget {

	private Capability capability;
	
	public GridWidget() {
		super();
	}

	@Override
	public void setCapability(Capability capability) {
		this.capability = capability;
	}

	@Override
	public Capability getCapability() {
		return capability;
	}
}
