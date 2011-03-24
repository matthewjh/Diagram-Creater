package com.matthew.diagram.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.matthew.diagram.client.view.MainView;

public interface ClientFactory {
	EventBus getEventBus();
	PlaceController getPlaceController();
	MainView getMainView();
}
