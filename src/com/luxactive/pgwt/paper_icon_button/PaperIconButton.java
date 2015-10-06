package com.luxactive.pgwt.paper_icon_button;

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


public class PaperIconButton extends BasicPaperElement{

	private static PaperButtonUiBinder uiBinder = GWT
			.create(PaperButtonUiBinder.class);

	interface PaperButtonUiBinder extends UiBinder<Widget, PaperIconButton> {
	}

	@UiField
	IPaperIconButton button;

	public PaperIconButton(final IPaperIconButton button) {
		this.button = button;
	}

	public PaperIconButton() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setIcon(String iconName){
		button.setIcon(iconName);
//		IPaperMaterial material = (IPaperMaterial)button.getElementsByTagName(paper_material)[0];
//		IIronIcon icon = (IIronIcon)material.getElementsByTagName(IIronIcon.tag)[0];
//		if(icon == null){
//			material.setInnerHTML(IIronIcon.element+material.getInnerHTML());
//			icon = (IIronIcon)material.getElementsByTagName(IIronIcon.tag)[0];
//			icon.setAttribute("icon", iconName);
//		}else
//			icon.setIcon(iconName);
	}
	
	public void setAlt(String alt){
		button.setAlt(alt);
	}
	
	public void setSrc(String src){
		button.setSrc(src);
	}

	@Override
	public HTMLElement getHTMLElement() {
		return button;
	}
	
	
}
