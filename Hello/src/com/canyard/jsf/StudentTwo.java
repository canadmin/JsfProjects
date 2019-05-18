package com.canyard.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	
	List<String> countryOptions;
	List<String> radioOptions;
	
	public StudentTwo() {
		countryOptions=new ArrayList<>();
		countryOptions.add("Turkiye");
		countryOptions.add("Fransa");
		countryOptions.add("Amerika");
		
		radioOptions=new ArrayList<>();
		
		radioOptions.add("Java");
		radioOptions.add("C++");
	}
	
	

	public List<String> getRadioOptions() {
		return radioOptions;
	}



	public List<String> getCountryOptions() {
		return countryOptions;
	}

	


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}



	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}



	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	
	
	
}
