package com.luxactive.pgwt.paper_input;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.luxactive.pgwt.basic.HTMLElement;

@JsType
public interface IPaperTextarea extends IPaperInput {
	
	@JsProperty
	void setMaxRows(int maxRows);
	@JsProperty
	void setRows(int rows);
	
}
