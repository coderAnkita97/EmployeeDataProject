package com.project.employee.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.employee.pojo.Employee;
import com.project.employee.pojo.EmployeeAddress;
import com.project.employee.service.EmployeeDataService;

public class EmployeeDataServiceImpl implements EmployeeDataService{

	List<Employee> emplList = new ArrayList<>();
	Scanner int_sc = new Scanner(System.in);
	Scanner string_sc = new Scanner(System.in);
	
	@Override
	public void addEmployee(Employee emp) {
		emplList.add(emp);
		System.out.println("employee details successfully added to the list\n");
	}

	@Override
	public Employee fillEmployeeDetails() {
		long id;
		System.out.println("Enter Employee Id");
		id = int_sc.nextLong();
		
		System.out.println("Enter Employee Full Name");
		String fName = string_sc.nextLine();
		
		System.out.println("Enter Employee Date of Birth in DD/MM/YYYY Format");
		String dob = string_sc.nextLine();
		
		System.out.println("Enter Employee Designation");
		String designation = string_sc.nextLine();
		
		System.out.println("Enter Employee Address");
		String address = string_sc.nextLine();
		
		System.out.println("Enter Emloyee City");
		String city = string_sc.nextLine();
		
		System.out.println("Enter Employee State");
		String state = string_sc.nextLine();
		
		System.out.println("Enter Employee Pincode");
		String pincode = string_sc.nextLine();
		EmployeeAddress fullAddress = new EmployeeAddress(address, city, state, pincode);
		Employee employee = new Employee(id, fName, dob, designation, fullAddress);
		return employee;
	}

	@Override
	public void getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		for (Employee employee : emplList) {
			System.out.println("list : "+employee);
		}
		System.out.println("");
	}

	@Override
	public Employee getEmployeeById(int eid) {
		// TODO Auto-generated method stub
		Employee selectEmpById = null;
		for (Employee employee : emplList) {
			if(employee != null && employee.getEmp_id() == eid) {
				selectEmpById = employee;
			}
		}
		return selectEmpById;
	}

	@Override
	public void deleteEmployeeById(int deleteById) {
		// TODO Auto-generated method stub
		Employee employee = getEmployeeById(deleteById);
		List<Employee> deletedEmplList = new ArrayList<>();
		if(employee == null) {
			System.out.println("Entered Id is not available in list. So can not be deleted\n");
		}
		else if(employee!=null) {
			for(Employee deleteEmp : emplList) {
				if(deleteEmp.getEmp_id()==employee.getEmp_id()) {
					continue;
				}
				deletedEmplList.add(deleteEmp);
			}
			emplList=deletedEmplList;
			System.out.println("Employee has been deleted successfully.\n");
		}
		
	}

	@Override
	public void updateEmployeeById(Employee emplDataToUpdate) {
		// TODO Auto-generated method stub
		EmployeeAddress updateEmplAdrs;
		System.out.println("update the deatils of employee with id:"+emplDataToUpdate.getEmp_id());
		System.out.println("Enter Employee Full Name");
		emplDataToUpdate.setEmp_name(string_sc.nextLine());
		
		System.out.println("Enter Employee Date of Birth in DD/MM/YYYY Format");
		emplDataToUpdate.setDate_of_birth(string_sc.nextLine());
		
		System.out.println("Enter Employee Designation");
		emplDataToUpdate.setDesignation(string_sc.nextLine());
		
		System.out.println("Enter Employee Address");
		String address = string_sc.nextLine();
		
		System.out.println("Enter Emloyee City");
		String city = string_sc.nextLine();
		
		System.out.println("Enter Employee State");
		String state = string_sc.nextLine();
		
		System.out.println("Enter Employee Pincode");
		String pincode = string_sc.nextLine();
		
		updateEmplAdrs = new EmployeeAddress(address, city, state, pincode);
		emplDataToUpdate.setEmp_address(updateEmplAdrs);
		System.out.println("successfully updated");
	}

	
}
