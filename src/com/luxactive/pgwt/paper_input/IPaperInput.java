package com.luxactive.pgwt.paper_input;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.luxactive.pgwt.basic.HTMLElement;

@JsType
public interface IPaperInput extends HTMLElement {
	@JsProperty	
	void setAllowedPattern(String allowedPattern);
	@JsProperty
	void setAlwaysFloatLabel(boolean alwaysFloatLabel);
	@JsProperty
	void setAutocapitalize(String autocapitalize);
	@JsProperty
	void setAutocomplete(String autocomplete);
	@JsProperty
	void setAutocorrect(String autocorrect);
	@JsProperty
	void setAutofocus(boolean autofocus);
	@JsProperty
	void setAutoValidate(boolean autoValidate);
	@JsProperty
	void setCharCounter(boolean charCounter);
	@JsProperty
	void setDisabled(boolean disabled);
	@JsProperty
	void setErrorMessage(String errorMessage);
	@JsProperty
	void setInputmode(String inputmode);
	@JsProperty
	void setInvalid(boolean invalid);
	@JsProperty
	void setLabel(String label);
	@JsProperty
	void setList(String list);
	@JsProperty
	void setMax(String max);
	@JsProperty
	void setMaxlength(int maxlength);
	@JsProperty
	void setMin(String min);
	@JsProperty
	void setMinlength(int minlength);
	@JsProperty
	void setName(String name);
	@JsProperty
	void setNoLabelFloat(boolean noLabelFloat);
	@JsProperty
	void setPattern(String pattern);
	@JsProperty
	void setPlaceholder(String placeholder);
	@JsProperty
	void setPreventInvalidInput(boolean preventInvalidInput);
	@JsProperty
	void setReadonly(boolean readonly);
	@JsProperty
	void setRequired(boolean required);
	@JsProperty
	void setSize(int size);
	@JsProperty
	void setStep(String step);
	@JsProperty
	void setType(String type);
	@JsProperty
	void setValidator(String validator);
	@JsProperty
	void setValue(String value);
	
	HTMLElement inputElement();
	void updateValueAndPreserveCaret(String newValue);
	boolean validate();
}
