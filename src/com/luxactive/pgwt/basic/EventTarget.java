package com.luxactive.pgwt.basic;

import com.google.gwt.core.client.js.JsType;

@JsType
public interface EventTarget {
	void addEventListener(String type, EventListener listener);
	void removeEventListener(String type, EventListener listener);
}
