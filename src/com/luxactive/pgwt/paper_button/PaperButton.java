package com.luxactive.pgwt.paper_button;

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


public class PaperButton extends BasicPaperElement{

	private static PaperButtonUiBinder uiBinder = GWT
			.create(PaperButtonUiBinder.class);

	interface PaperButtonUiBinder extends UiBinder<Widget, PaperButton> {
	}

	@UiField
	IPaperButton button;

	private EventListener onMouseDown = new EventListener() {
		@Override
		public void handleEvent(Event event) {
			if(button.getRaised()){
				setElevation(4);
			}
		}
	};
	private EventListener onMouseUp = new EventListener() {
		@Override
		public void handleEvent(Event event) {
			if(button.getRaised()){
				setElevation(1);
			}
		}
	};

	public PaperButton(final IPaperButton button) {
		this.button = button;
		addEventListener("mousedown", onMouseDown);
		addEventListener("mouseup", onMouseUp);
	}

	public PaperButton() {
		initWidget(uiBinder.createAndBindUi(this));
		addEventListener("mousedown", onMouseDown);
		addEventListener("mouseup", onMouseUp);
	}

	public void setText(String text) {
		button.setInnerHTML(button.getInnerHTML()+text);
	}
	
	public void setToggles(boolean toggles) {
		button.setAttribute("toggles", ""+toggles);
	}

	public void setIcon(String iconName){
//		IPaperMaterial material = (IPaperMaterial)button.getElementsByClassName("content")[0];
		IIronIcon icon = (IIronIcon)button.getElementsByTagName(IIronIcon.tag)[0];
		if(icon == null){
			button.setInnerHTML(IIronIcon.element+button.getInnerHTML());
			icon = (IIronIcon)button.getElementsByTagName(IIronIcon.tag)[0];
			icon.setAttribute("icon", iconName);
		}else
			icon.setIcon(iconName);
	}

	@Override
	public HTMLElement getHTMLElement() {
		return button;
	}

	public void setRaised(boolean raised){
		button.setRaised(raised);
	}
}
