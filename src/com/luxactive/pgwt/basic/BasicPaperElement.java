package com.luxactive.pgwt.basic;

import com.google.gwt.user.client.ui.Composite;
import com.luxactive.pgwt.paper_material.IPaperMaterial;

public abstract class BasicPaperElement extends Composite{

	protected final String paper_material = "paper-material";

	@Override
	public void setStyleName(String style) {
		getHTMLElement().setClassName(getHTMLElement().getClassName()+" "+style);
	}

	@Override
	public void removeStyleName(String style) {
		String className = getHTMLElement().getClassName();
		className = className.replace(style, "");
		getHTMLElement().setClassName(className);
	}

	public abstract HTMLElement getHTMLElement();

	public void addEventListener(String event, EventListener listener){
		getHTMLElement().addEventListener(event, listener);
	}
	
	public void addClickEventListener(EventListener listener){
		addEventListener("click", listener);
	}

	public void setVisible(boolean visible){
		getHTMLElement().setHidden(!visible);
	}

	public void setDisabled(boolean disabled) {
		getHTMLElement().setDisabled(disabled);
	}

	public void setNoink(boolean noink) {
		getHTMLElement().setNoink(noink);
		getHTMLElement().setAttribute("noink", "true");
	}

	public void setElevation(int elevation){
		IPaperMaterial material = (IPaperMaterial)getHTMLElement().getElementsByTagName(paper_material)[0];
		if(material != null)
			material.setElevation(elevation);
	}

	public int getElevation(){
		IPaperMaterial material = (IPaperMaterial)getHTMLElement().getElementsByTagName(paper_material)[0];
		if(material != null)
			return material.getElevation();
		return 0;
	}
}
