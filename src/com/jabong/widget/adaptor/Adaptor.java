package com.jabong.widget.adaptor;

/**
 * Data filling to the widgets.
 *
 * @param <T> Model associated with the adaptor.
 */
public interface Adaptor<T> {
	
	/**
	 * Returns the total items
	 * @return size of the data list.
	 */
	int getItemCount();

	/**
	 * Returns the item for filling the UI.
	 * @return T
	 */
	T getItem();

	/**
	 * Updates the ui as data set has changed.
	 */
	void notifyDataSetChannged();
}
