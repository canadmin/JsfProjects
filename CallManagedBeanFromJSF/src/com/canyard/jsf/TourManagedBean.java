package com.canyard.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TourManagedBean {
	private String kindOfTour;

	public TourManagedBean() {

	}

	public String getKindOfTour() {
		return kindOfTour;
	}

	public void setKindOfTour(String kindOfTour) {
		this.kindOfTour = kindOfTour;
	}

	public String startTheTour() {
		
		if(kindOfTour!=null && kindOfTour.equals("city")) {
			return "city_tour";
		}else {
			return "country_tour";
		}

	}

}
