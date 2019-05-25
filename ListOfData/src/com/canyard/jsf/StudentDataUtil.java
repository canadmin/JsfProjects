package com.canyard.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.canyard.model.Student;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {
	private List<Student> student;
	
	public StudentDataUtil() {
	loadData();
	}
	public void loadData() {
		student=new ArrayList<>();
		student.add(new Student("Can","Yard","canyard@gmail.com"));
		student.add(new Student("Yusuf","cezik","yusuf@gmail.com"));
		student.add(new Student("Rıdvan","Kabak","rıdvan@gmail.com"));

		
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}

	
}
