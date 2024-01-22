package com.buyerguide.sbg.propertyeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String lowerCasedString = text.toLowerCase();
		setValue(lowerCasedString);
	}
	
	
}
