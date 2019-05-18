package com.canyard.jsf;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class CounterTwo {
	
	private int value=0;
	
	
	public CounterTwo() {
	}
	public String increment() {
		value++;
		return "student_twoss";
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	

}
