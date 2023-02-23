package com.project.employee.main;

import java.util.Scanner;

import com.project.employee.pojo.Employee;
import com.project.employee.service.EmployeeDataService;
import com.project.employee.service.impl.EmployeeDataServiceImpl;

public class EmployeeDataApplication {

	
	
	public static void main(String[] args) {
		EmployeeDataService empService = new EmployeeDataServiceImpl();
		Scanner sc = new Scanner(System.in);
		int option = 0;
		
		do {
			System.out.println("1.Add Employee Details\n2.Get Employee Details\n3.Delete Employee Details\n4.Update Employee Details\n5.Exit\n6.Get All Employee Deatails\n\n");
			
			System.out.println("Select above options to perform any operations :");
			option = sc.nextInt();
			switch (option) {
			case 1: //add employee data
			{
				Employee empoyeeObj = empService.fillEmployeeDetails();
				empService.addEmployee(empoyeeObj);
				break;
			}
			case 2: //get employee details by entering Id 
			{
				System.out.println("Enter Employee Id to Get Details");
				int eid = sc.nextInt();
				Employee employeeById = empService.getEmployeeById(eid);
				System.out.println("Employee details are shown below :\n"+employeeById+"\n");
				break;
			}
			case 3: //delete employee data
			{
				System.out.println("Enter Employee Id to Delete Data");
				int eid = sc.nextInt();
				empService.deleteEmployeeById(eid);
				break;
			}
			case 4: //update employee data
			{
				System.out.println("Enter employee id to update the data");
				int empIdToUpdate = sc.nextInt();
				Employee emplDataToUpdate = empService.getEmployeeById(empIdToUpdate);
				empService.updateEmployeeById(emplDataToUpdate);
				break;
			}
			case 5: //exit the application
			{
				System.out.println("You have exit the application.Thank you...!!!!!!!!!");
				System.exit(0);
				break;
			}
			case 6: //get details of all employees
			{
				empService.getAllEmployeeDetails();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}
		}while(option!=5);
			sc.close();
		
	}
}
