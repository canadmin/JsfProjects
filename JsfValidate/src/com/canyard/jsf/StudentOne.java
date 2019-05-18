package com.canyard.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class StudentOne {
	
	private String firstName;
	private String lastName;
	private String email;
	private String freePasses;
	private String postalCode;
	private String phone;
	private String courseId;
	
	
	public StudentOne() {

	
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFreePasses() {
		return freePasses;
	}


	public void setFreePasses(String freePasses) {
		this.freePasses = freePasses;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCourseId() {
		return courseId;
	}


	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	public void validateTheCourse(FacesContext context,UIComponent component,Object value) throws ValidatorException {
		if(value==null) {
			return;
		}
		String data=value.toString();
		
		if(!data.startsWith("CAN")) {
			FacesMessage message=new FacesMessage("Course code must start with CAN");
			throw new ValidatorException(message);
		}
		
	}
	
	

}
