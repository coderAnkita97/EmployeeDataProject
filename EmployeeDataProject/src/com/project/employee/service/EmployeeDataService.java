package com.project.employee.service;

import com.project.employee.pojo.Employee;

public interface EmployeeDataService {

	public void addEmployee(Employee emp);
	public Employee fillEmployeeDetails();
	public void getAllEmployeeDetails();
	public void deleteEmployeeById(int deleteById);
	public void updateEmployeeById(Employee updateEmployeeObject);
	public Employee getEmployeeById(int eid);
}
