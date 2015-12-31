package com.jabong.widget;

import com.jabong.widget.adaptor.Adaptor;

public class DefaultCapability implements Capability {
	/**
	 * View Type
	 */
	private int id;
	/**
	 * Background type
	 */
	private int backgroundId;
	/**
	 * Aspect ration of the widget. Used for calculating the height to avoid
	 * flicker at the time of image rendering.
	 */
	private float aspectRatio;

	private int leftMarging, rightMargin, topMargin, leftMargin;
	/**
	 * 
	 */
	private Adaptor<?> dataSet;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBackgroundId() {
		return backgroundId;
	}

	public void setBackgroundId(int backgroundId) {
		this.backgroundId = backgroundId;
	}

	public float getAspectRatio() {
		return aspectRatio;
	}

	public void setAspectRatio(float aspectRatio) {
		this.aspectRatio = aspectRatio;
	}

	public int getLeftMarging() {
		return leftMarging;
	}

	public void setLeftMarging(int leftMarging) {
		this.leftMarging = leftMarging;
	}

	public int getRightMargin() {
		return rightMargin;
	}

	public void setRightMargin(int rightMargin) {
		this.rightMargin = rightMargin;
	}

	public int getTopMargin() {
		return topMargin;
	}

	public void setTopMargin(int topMargin) {
		this.topMargin = topMargin;
	}

	public int getLeftMargin() {
		return leftMargin;
	}

	public void setLeftMargin(int leftMargin) {
		this.leftMargin = leftMargin;
	}

	@Override
	public <T> void setAdaptor(Adaptor<T> adaptor) {
		this.dataSet = adaptor;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Adaptor<?> getAdaptor() {
		return this.dataSet;
	}

	@Override
	public void applyCapability(Widget widget) {
		// TODO Default implementation for all types of Capability
	}
}
