package com.luxactive.pgwt.paper_radio_button;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.luxactive.pgwt.basic.HTMLElement;

@JsType
public interface IPaperRadioButton extends HTMLElement {
	
	@JsProperty
	void setActive(boolean active);

	@JsProperty
	void setAriaActiveAttribute(HTMLElement ariaActiveAttribute);

	@JsProperty
	void setChecked(boolean checked);
	
	@JsProperty
	boolean getChecked();
	
	// disabled -> exteded

	@JsProperty
	void setFocused(boolean focused);
	
	@JsProperty
	void setInvalid(boolean invalid);
	
	@JsProperty
	void setKeyBindings(HTMLElement keyBindings);

	@JsProperty
	void setKeyEventTarget(HTMLElement keyEventTarget);
	
	@JsProperty
	void setName(String name);
	
	@JsProperty
	void setPointerDown(boolean pointerDown);
	
	@JsProperty
	void setPressed(boolean pressed);
	
	@JsProperty
	void setReceivedFocusFromKeyboard(boolean receivedFocusFromKeyboard);
	
	@JsProperty
	void setRequired(boolean required);
	
	@JsProperty
	void setToggles(boolean toggles);
	
	@JsProperty
	void setValidator(String validator);
	
	@JsProperty
	void setValidatorType(String validatorType);
	
	@JsProperty
	void setValue(String value);
	
	void updateAriaLabel();
	
	boolean validate(String value);
	
	
}


