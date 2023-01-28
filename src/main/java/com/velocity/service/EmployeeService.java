package com.velocity.service;

import com.velocity.model.Employee;

//Design service - design interface in which method
public interface EmployeeService {

	public Employee saveEmployee(Employee emp);
	
	public Employee getEmployee(int id);
	
}
