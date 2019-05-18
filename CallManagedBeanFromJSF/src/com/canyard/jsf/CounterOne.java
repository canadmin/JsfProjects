package com.canyard.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CounterOne {
	private int value=0;
	
	public CounterOne() {
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
