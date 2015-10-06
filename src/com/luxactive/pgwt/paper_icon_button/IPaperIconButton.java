package com.luxactive.pgwt.paper_icon_button;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.luxactive.pgwt.basic.HTMLElement;

@JsType
public interface IPaperIconButton extends HTMLElement {
	@JsProperty
	void setAlt(String alt);
	@JsProperty
	void setIcon(String icon);
	@JsProperty
	void setSrc(String src);
}
