package view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DaoGeneric;
import entities.Employee;

@ManagedBean(name = "employeeBean")
public class EmployeeBean {

		private Employee employee=new Employee();
		private DaoGeneric<Employee> daoGeneric=new DaoGeneric<>();
		
		
		public String save() {
			daoGeneric.kaydet(employee);			
			return "basarili";
		}


		public DaoGeneric<Employee> getDaoGeneric() {
			return daoGeneric;
		}


		public void setDaoGeneric(DaoGeneric<Employee> daoGeneric) {
			this.daoGeneric = daoGeneric;
		}


		public Employee getEmployee() {
			return employee;
		}


		public void setEmployee(Employee employee) {
			this.employee = employee;
		}
	
		
		
}
