package com.struts.action;

import org.apache.struts2.components.Else;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Employee;

public class EmployeeAction extends ActionSupport{
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String execute() {
		if(employee.getEmployeeName().equals("Arya"))
			return "success";
		
		else
		return "error";
	}
}
