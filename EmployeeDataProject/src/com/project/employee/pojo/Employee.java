package com.project.employee.pojo;

public class Employee {

	private long emp_id;
	private String emp_name;
	private String date_of_birth;
	private String designation;
	private EmployeeAddress emp_address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(long emp_id, String emp_name, String date_of_birth, String designation,
			EmployeeAddress emp_address) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.date_of_birth = date_of_birth;
		this.designation = designation;
		this.emp_address = emp_address;
	}


	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public EmployeeAddress getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(EmployeeAddress emp_address) {
		this.emp_address = emp_address;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", date_of_birth=" + date_of_birth
				+ ", designation=" + designation + ", emp_address=" + emp_address + "]";
	}
	
	
}
