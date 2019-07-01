package test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import dao.DaoGeneric;
import entities.Employee;
import jpautil.JPaUtil;

public class Test {

	public static void main(String[] args) {

		
		Employee empl=new Employee();
		DaoGeneric<Employee>daoGeneric=new DaoGeneric<>();
		empl.setAge(123);
		empl.setFirstName("can");
		empl.setLastName("denem");
		daoGeneric.kaydet(empl);
	}

}
