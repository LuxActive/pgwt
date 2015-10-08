package com.luxactive.pgwt.basic;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface HTMLElement extends Node {

	@JsProperty
	void setInnerHTML(String text);

	@JsProperty
	String getInnerHTML();

	@JsProperty
	void setInnerText(String text);

	@JsProperty
	String getInnerText();

	@JsProperty
	String getOuterHTML();

	@JsProperty
	void setClassName(String className);

	@JsProperty
	String getClassName();

	@JsProperty
	void setHidden(boolean visible);

	boolean hasAttribute(String name);

	void removeAttribute(String name);

	void setAttribute(String name, String value);
	String getAttribute(String name);

	@JsProperty
	void setDisabled(boolean disabled);

	@JsProperty
	boolean getDisabled();

	@JsProperty
	void setNoink(boolean noink);

	HTMLElement[] getElementsByTagName(String tagName);

	HTMLElement[] getElementsByClassName(String className);
	
	void removeChild(com.google.gwt.dom.client.Node element);

	void appendChild(HTMLElement element);
}
