package com.luxactive.pgwt.paper_card;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.luxactive.pgwt.basic.HTMLElement;

@JsType
public interface IPaperCard extends HTMLElement {
	
	final String card_content = "card-content";
	final String card_actions = "card-actions";
	final String element_content = "<div class=\""+card_content+"\"></div>";
	final String element_action = "<div class=\""+card_actions+"\"></div>";
	
	@JsProperty
	void setHeading(String heading);
	@JsProperty
	void setImage(String image);
	@JsProperty
	void setElevation(int elevation);
	@JsProperty
	int getElevation();
	@JsProperty
	void setAnimatedShadow(boolean animated);
}
