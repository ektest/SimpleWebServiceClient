package com.emre.client;

import java.util.List;

import com.emre.staffmanagement.Employee;
import com.emre.staffmanagement.EmployeeManagementImplementationService;
import com.emre.staffmanagement.EmployeeManagementWebService;

public class WebServiceClientTest {

	public static void main(String[] args) {
		EmployeeManagementWebService service = 
				new EmployeeManagementImplementationService().getEmployeeManagementWebServicePort();

		List<Employee> employees = service.getAllEmployees();
		
		for (Employee next : employees)
		{
			System.out.println(next);
		}
	}

}
