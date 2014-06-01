SimpleWebServiceClient
======================

This is for Employment Management Service
======================

* WDSL: http://localhost:8080/EmployeeManagementImplementationService/employeeManagementWebService?wsdl
* Test it:  http://localhost:8080/EmployeeManagementImplementationService/employeeManagementWebService?Tester

======================

* wsimport -s ./src/ -d ./bin/ -keep -verbose http://localhost:8080/EmployeeManagementImplementationService/employeeManagementWebService?wsdl
