package com.luxactive.pgwt.paper_card;

import java.util.ArrayList;
import java.util.Iterator;

import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Node;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.luxactive.pgwt.basic.BasicPaperElement;
import com.luxactive.pgwt.basic.HTMLElement;
import com.luxactive.pgwt.paper_button.IPaperButton;
import com.luxactive.pgwt.paper_material.IPaperMaterial;


public class PaperCard extends BasicPaperElement implements HasHTML{

	private static PaperButtonUiBinder uiBinder = GWT
			.create(PaperButtonUiBinder.class);

	interface PaperButtonUiBinder extends UiBinder<Widget, PaperCard> {
	}

	@UiField
	IPaperCard element;

	public PaperCard(IPaperCard element) {
		this.element = element;
	}

	public PaperCard() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public HTMLElement getHTMLElement() {
		return element;
	}

	public void setHeading(String heading){
		element.setHeading(heading);
		HTMLElement el = (HTMLElement)element.getElementsByClassName("title-text style-scope paper-card")[0];
		if(el != null){
			el.removeAttribute("hidden");
			el.setInnerHTML(heading);
		}
	}

	//Workaround since I could not get css styling to work
	public void setHeadingStyle(String styling){
		HTMLElement el = (HTMLElement)element.getElementsByClassName("title-text style-scope paper-card")[0];
		if(el != null){
			el.setAttribute("style", styling);
		}
	}

	public void setImage(String imagePath){
		element.setImage(imagePath);
		HTMLElement el = (HTMLElement)element.getElementsByClassName("header style-scope paper-card")[0];
		if(el != null){
			HTMLElement img = (HTMLElement)el.getElementsByTagName("img")[0];
			HTMLElement div = (HTMLElement)el.getElementsByTagName("div")[0];
			if(img != null && div != null){
				img.setAttribute("src", imagePath);
				img.removeAttribute("hidden");
				div.setClassName(div.getClassName()+" over-image");
			}
		}
	}

	public void setAnimatedShadow(boolean animated){
		element.setAnimatedShadow(animated);
	}

	public void setContent(String value){
		HTMLElement div = (HTMLElement)element.getElementsByClassName(IPaperCard.card_content)[0];
		if(div == null){
			element.setInnerHTML(IPaperCard.element_content+element.getInnerHTML());
			div = (HTMLElement)element.getElementsByClassName(IPaperCard.card_content)[0];
		}
		div.setInnerHTML(value);
	}

	@Override
	public String getText() {
		return getHTML();
	}

	@Override
	public void setText(String text) {
		setHTML(text);
	}

	@Override
	public String getHTML() {
		return null;
	}

	@Override
	public void setHTML(String html) {
		if(html.contains(IPaperCard.card_content)){
			Node div = (Node)element.getElementsByClassName(IPaperCard.card_content)[0];
			if(div!= null)
				element.removeChild(div);
		}
		if(html.contains(IPaperCard.card_actions)){
			Node div = (Node)element.getElementsByClassName(IPaperCard.card_actions)[0];
			if(div!= null)
				element.removeChild(div);
		}
		element.setInnerHTML(element.getInnerHTML()+html);
	}
}
