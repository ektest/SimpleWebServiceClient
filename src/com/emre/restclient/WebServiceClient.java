package com.emre.restclient;

import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

public class WebServiceClient {

	public static void main(String[] args) {
		Client client = Client.create();
		WebResource web = client.resource(
							"http://localhost:8080/webapp/webservice/employees/51");
		Employee emp = web.accept
				("application/xml").get
						(Employee.class);
		
		System.out.println("Firstname: " + emp.getFirstName());
		System.out.println("Surname: " + emp.getSurname());
		System.out.println("Job Role: " + emp.getJobRole());
		System.out.println("Salary: " + emp.getSalary());

		String json = web.accept
				("application/json").get
						(String.class);
		
		System.out.println(json);
		
		web = client.resource(
				"http://localhost:8080/webapp/webservice/employees/");
		List<Employee> allEmployees = web.accept
						("application/xml").get
								(new GenericType<List<Employee>>(){});

		for (Employee next : allEmployees){
			System.out.println("############");
			System.out.println("Firstname: " + next.getFirstName());
			System.out.println("Surname: " + next.getSurname());
			System.out.println("Job Role: " + next.getJobRole());
			System.out.println("Salary: " + next.getSalary());
		}

		json = web.accept
				("application/json").get
						(String.class);
		
		System.out.println(json);

		// create a new employee 
		web = client.resource("http://localhost:8080/webapp/webservice/employees/");
		
		//String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><employee><firstName>AJames</firstName><jobRole>Trainer</jobRole><salary>100000</salary><surname>B</surname></employee>";

		Employee newEmployee = new Employee();
		newEmployee.setFirstName("James-B");
		newEmployee.setSurname("Gosling");
		newEmployee.setJobRole("Creator of Java");
		newEmployee.setSalary(1000000);

		ClientResponse response = web.accept
					("application/xml").type
		         		("application/xml").post
		        		 	(ClientResponse.class, newEmployee);

		System.out.println("The response code was " + response.getStatus());
		
		if (response.getStatus() == 200)
		{
			System.out.println(response.getEntity(Employee.class).getFirstName());
		}
		
		// Test delete
		web = client.resource("http://localhost:8080/webapp/webservice/employees/705");
		response = web.delete(ClientResponse.class);
		
		if(response.getStatus() == 404)
		{
			System.out.println("Employee could not find!");
		}
	}
}