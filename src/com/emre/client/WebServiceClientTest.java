package com.emre.client;

import java.util.List;

import com.emre.staffmanagement.Employee;
import com.emre.staffmanagement.EmployeeManagementImplementationService;
import com.emre.staffmanagement.EmployeeManagementWebService;
import com.emre.staffmanagement.SystemUnavaliableException;
import com.emre.staffmanagement.SystemUnavaliableException_Exception;

public class WebServiceClientTest {

	public static void main(String[] args) {
		EmployeeManagementWebService service = 
				new EmployeeManagementImplementationService().getEmployeeManagementWebServicePort();

		List<Employee> employees = service.getAllEmployees();

		for (Employee next : employees)
		{
			System.out.println(next);
			System.out.println(next.getFirstName() + " " + next.getSurname());
		}

		Employee emp = new Employee();
		emp.setFirstName("Bill");
		emp.setSurname("Bill");
		emp.setJobRole("Actor");
		emp.setSalary(1899);
		
		try{
			service.registerEmployee(emp);
			
		}catch(SystemUnavaliableException_Exception e)
		{
			System.out.println("System is down or unavaliable");
		}
	}
}
