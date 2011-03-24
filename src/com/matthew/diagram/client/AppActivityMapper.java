package com.matthew.diagram.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.matthew.diagram.client.activity.MainActivity;
import com.matthew.diagram.client.place.MainPlace;

public class AppActivityMapper implements ActivityMapper {

	private ClientFactory clientFactory;
	
	public AppActivityMapper(ClientFactory clientFactory) {
		super();
		this.clientFactory = clientFactory;
	}
	
	@Override
	public Activity getActivity(Place place) {
		if (place instanceof MainPlace)
			return new MainActivity((MainPlace) place, clientFactory);
		
		return null;
	}

}
