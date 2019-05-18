package com.canyard.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CounterThree {
	
	private int value=0;
	
	public CounterThree() {
		// TODO Auto-generated constructor stub
	}
	public String increment() {
		
		value++;
		return "asdasd";
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	

}
