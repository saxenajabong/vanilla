package com.jabong.widget;

import com.jabong.widget.adaptor.Adaptor;

public interface Capability {

	/**
	 * Sets the data adaptor for filling the widget items.
	 * 
	 * @param adaptor
	 *            instance of {@link Adaptor}.
	 */
	<T> void setAdaptor(Adaptor<T> adaptor);
	
	/**
	 * {@link Adaptor}
	 * 
	 * @return the adaptor instance.
	 */
	<T> Adaptor<T> getAdaptor();

	/**
	 * Apply all the {@link Capability} to the {@link Widget}
	 * 
	 * @param widget
	 */
	void applyCapability(Widget widget);

}
