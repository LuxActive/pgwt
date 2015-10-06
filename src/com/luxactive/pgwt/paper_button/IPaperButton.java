package com.luxactive.pgwt.paper_button;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.luxactive.pgwt.basic.HTMLElement;

@JsType
public interface IPaperButton extends HTMLElement {
	@JsProperty
	void setRaised(boolean raised);
	@JsProperty
	boolean getRaised();
}
