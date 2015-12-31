package com.jabong.widget;

public class CarouselWidget implements Widget {

	private Capability capability;
	
	public CarouselWidget() {
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
