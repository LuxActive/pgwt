package com.luxactive.pgwt.paper_material;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.luxactive.pgwt.basic.HTMLElement;

@JsType
public interface IPaperMaterial extends HTMLElement {
	@JsProperty
	void setAnimated(boolean animated);
	@JsProperty
	void setElevation(int elevation);
	@JsProperty
	int getElevation();
}
