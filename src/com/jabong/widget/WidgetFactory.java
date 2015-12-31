package com.jabong.widget;

/**
 * Widget factory for creating various supported widgets.
 */
public class WidgetFactory {

	private enum Type {
		CAROUSEL, GRID
	}

	/**
	 * Takes input as type of widget
	 * 
	 * @param type
	 *            type of Widget {@link Type}
	 * @return instance of {@link Widget}
	 */
	public static Widget getWidget(Type type) {
		Widget widget = null;
		switch (type) {
			case CAROUSEL:
				widget = new CarouselWidget();
				break;
			case GRID:
				widget = new GridWidget();
				break;
			default:
				throw new IllegalArgumentException(type.name() + " not supported");
		}
		widget.setCapability(new DefaultCapability());
		return widget;
	}

}
