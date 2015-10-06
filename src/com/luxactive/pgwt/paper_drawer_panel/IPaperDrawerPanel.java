package com.luxactive.pgwt.paper_drawer_panel;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.luxactive.pgwt.basic.HTMLElement;

@JsType
public interface IPaperDrawerPanel extends HTMLElement {
	@JsProperty
	void setDefaultSelected(String defaultSelected);
	@JsProperty
	void setDisableEdgeSwipe(boolean disableEdgeSwipe);
	@JsProperty
	void setDisableSwipe(boolean disableSwipe);
	@JsProperty
	void setDragging(boolean dragging);
	@JsProperty
	void setDrawerToggleAttrib(String drawerToggleAttrib);
	@JsProperty
	void setDrawerWidth(String drawerWidth);
	@JsProperty
	void setEdgeSwipeSensitivity(int edgeSwipeSensitivity);
	@JsProperty
	void setForceNarrow(boolean forceNarrow);
	@JsProperty
	void setHasTransform(boolean hasTransform);
	@JsProperty
	void setHasWillChange(boolean hasWillChange);
	@JsProperty
	void setNarrow(boolean narrow);
	@JsProperty
	boolean getNarrow();
	@JsProperty
	void setPeeking(boolean peeking);
	@JsProperty
	void setResponsiveWidth(String responsiveWidth);
	@JsProperty
	void setRightDrawer(boolean rightDrawer);
	@JsProperty
	void setSelected(String selected);
	@JsProperty
	void setTransition(boolean transition);
	
	void closeDrawer();
	void openDrawer();
	void togglePanel();
}
