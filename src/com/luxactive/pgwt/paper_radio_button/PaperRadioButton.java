package com.luxactive.pgwt.paper_radio_button;

import java.util.ArrayList;
import java.util.List;

import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.luxactive.pgwt.basic.BasicPaperElement;
import com.luxactive.pgwt.basic.Event;
import com.luxactive.pgwt.basic.EventListener;
import com.luxactive.pgwt.basic.HTMLElement;
import com.luxactive.pgwt.iron_icon.IIronIcon;
import com.luxactive.pgwt.paper_material.IPaperMaterial;

import net.sourceforge.htmlunit.corejs.javascript.ast.Label;


public class PaperRadioButton extends BasicPaperElement{

	private static PaperButtonUiBinder uiBinder = GWT
			.create(PaperButtonUiBinder.class);

	interface PaperButtonUiBinder extends UiBinder<Widget, PaperRadioButton> {
	}

	@UiField
	IPaperRadioButton button;

	private String onColor;
	private String offColor;
	private EventListener onMouseDown = new EventListener() {
		@Override
		public void handleEvent(Event event) {
			GWT.log("DOWN");
			if(!button.getChecked()){
				setOnColor(onColor);
			}else{
				setOffColor(offColor);
			}
		}
	};

	public PaperRadioButton(final IPaperRadioButton button) {
		this.button = button;
		addEventListener("mousedown", onMouseDown);
	}

	public PaperRadioButton() {
		initWidget(uiBinder.createAndBindUi(this));
		addEventListener("mousedown", onMouseDown);
	}

	@Override
	public HTMLElement getHTMLElement() {
		return button;
	}

	public void setLabel(String label){
		HTMLElement[] elements = button.getElementsByClassName("style-scope paper-radio-button");
		for(int i = 0; i<elements.length; i++){
			HTMLElement el = elements[i];
			if(el.getAttribute("id").equals("radioLabel")){
				el.setInnerHTML(label);
				break;
			}
		}
	}

	public void setChecked(boolean checked){
		button.setChecked(checked);
	}

	public boolean getChecked(){
		return button.getChecked();
	}

	/* Workaround since offRadio styling would be overwritten by default styling.
	 * 
	 * 							paper-radio-button.color1[checked]
								#offRadio.paper-radio-button
								{border-color: #03a9f4;}
								paper-radio-button.color1[checked]
								#onRadio.paper-radio-button
								{background-color: #03a9f4;}
								paper-radio-button.color1
								#offRadio.paper-radio-button
								{border-color: #01579b;}
								paper-radio-button.color2
								#ink.paper-radio-button
								{color: #f44336;}
	 */
	public void setOnColor(String onColor){
		if(onColor != null){
			this.onColor = onColor;
			HTMLElement[] elements = button.getElementsByClassName("style-scope paper-radio-button");
			for(int i = 0; i<elements.length; i++){
				HTMLElement el = elements[i];
				if(el.getAttribute("id").equals("offRadio")){
					el.setAttribute("style", "border-color: "+onColor+";");
				}else if(el.getAttribute("id").equals("onRadio")){
					el.setAttribute("style", "background-color: "+onColor+";");
				}
			}
		}
	}

	public void setOffColor(String offColor){
		if(offColor != null){
			this.offColor = offColor;
			HTMLElement[] elements = button.getElementsByClassName("style-scope paper-radio-button");
			for(int i = 0; i<elements.length; i++){
				HTMLElement el = elements[i];
				if(el.getAttribute("id").equals("offRadio")){
					el.setAttribute("style", "border-color: "+offColor+";");
				}
			}
		}
	}

}
