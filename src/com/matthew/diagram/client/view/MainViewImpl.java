package com.matthew.diagram.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class MainViewImpl extends Composite implements MainView {
	private static MainViewImplUiBinder uiBinder = 
		GWT.create(MainViewImplUiBinder.class);
	
	interface MainViewImplUiBinder extends UiBinder<HTMLPanel, MainView> {
	}
	
	@UiField
	SpanElement nameSpan;

	private Presenter presenter;
	
	public MainViewImpl() {
		initWidget((Widget) uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

}
