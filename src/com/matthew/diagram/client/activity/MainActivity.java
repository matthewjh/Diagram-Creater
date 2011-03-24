package com.matthew.diagram.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.matthew.diagram.client.ClientFactory;
import com.matthew.diagram.client.place.MainPlace;
import com.matthew.diagram.client.view.MainView;
import com.matthew.diagram.client.view.MainView.Presenter;

public class MainActivity extends AbstractActivity implements Presenter {
	private ClientFactory clientFactory;
	
	public MainActivity(MainPlace place, ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}
	
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		MainView mainView = clientFactory.getMainView();
		mainView.setPresenter(this);
		panel.setWidget(mainView.asWidget());
	}

	@Override
	public void goTo(Place place) {
		clientFactory.getPlaceController().goTo(place);
	}

}
