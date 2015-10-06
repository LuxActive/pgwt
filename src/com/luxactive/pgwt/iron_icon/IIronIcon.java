package com.luxactive.pgwt.iron_icon;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.luxactive.pgwt.basic.HTMLElement;

@JsType
public interface IIronIcon extends HTMLElement{
	final String tag = "iron-icon";
	final String element = "<"+tag+"></"+tag+">";
	
	@JsProperty
	void setIcon(String icon);
	@JsProperty
	void setSrc(String src);
	@JsProperty
	void setTheme(String theme);
}
