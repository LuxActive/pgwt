package com.luxactive.pgwt.paper_input;

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
import com.luxactive.pgwt.basic.HTMLElement;

import net.sourceforge.htmlunit.corejs.javascript.ast.Label;


public class PaperTextarea extends BasicPaperInput{

	private static PaperButtonUiBinder uiBinder = GWT
			.create(PaperButtonUiBinder.class);

	interface PaperButtonUiBinder extends UiBinder<Widget, PaperTextarea> {
	}

	@UiField
	IPaperTextarea element;

	public PaperTextarea(final IPaperTextarea element) {
		this.element = element;
	}

	public PaperTextarea() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public HTMLElement getHTMLElement() {
		return element;
	}
	
	public void setMaxRows(int maxRows){
		element.setMaxRows(maxRows);
	}
	
	public void setRows(int rows){
		element.setRows(rows);
	}
	
}
