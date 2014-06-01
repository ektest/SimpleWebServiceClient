
package com.emre.staffmanagement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.emre.staffmanagement package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchBySurnameResponse_QNAME = new QName("http://staffmanagement.emre.com/", "searchBySurnameResponse");
    private final static QName _SystemUnavaliableException_QNAME = new QName("http://staffmanagement.emre.com/", "SystemUnavaliableException");
    private final static QName _DummyResponse_QNAME = new QName("http://staffmanagement.emre.com/", "dummyResponse");
    private final static QName _GetAllEmployees_QNAME = new QName("http://staffmanagement.emre.com/", "getAllEmployees");
    private final static QName _GetAllEmployeesResponse_QNAME = new QName("http://staffmanagement.emre.com/", "getAllEmployeesResponse");
    private final static QName _RegisterEmployee_QNAME = new QName("http://staffmanagement.emre.com/", "registerEmployee");
    private final static QName _RollbackCheckedExceptionResponse_QNAME = new QName("http://staffmanagement.emre.com/", "rollbackCheckedExceptionResponse");
    private final static QName _SearchBySurname_QNAME = new QName("http://staffmanagement.emre.com/", "searchBySurname");
    private final static QName _Dummy_QNAME = new QName("http://staffmanagement.emre.com/", "dummy");
    private final static QName _RegisterEmployeeResponse_QNAME = new QName("http://staffmanagement.emre.com/", "registerEmployeeResponse");
    private final static QName _RollbackCheckedException_QNAME = new QName("http://staffmanagement.emre.com/", "rollbackCheckedException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.emre.staffmanagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchBySurname }
     * 
     */
    public SearchBySurname createSearchBySurname() {
        return new SearchBySurname();
    }

    /**
     * Create an instance of {@link RegisterEmployee }
     * 
     */
    public RegisterEmployee createRegisterEmployee() {
        return new RegisterEmployee();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link RollbackCheckedExceptionResponse }
     * 
     */
    public RollbackCheckedExceptionResponse createRollbackCheckedExceptionResponse() {
        return new RollbackCheckedExceptionResponse();
    }

    /**
     * Create an instance of {@link SearchBySurnameResponse }
     * 
     */
    public SearchBySurnameResponse createSearchBySurnameResponse() {
        return new SearchBySurnameResponse();
    }

    /**
     * Create an instance of {@link RegisterEmployeeResponse }
     * 
     */
    public RegisterEmployeeResponse createRegisterEmployeeResponse() {
        return new RegisterEmployeeResponse();
    }

    /**
     * Create an instance of {@link RollbackCheckedException }
     * 
     */
    public RollbackCheckedException createRollbackCheckedException() {
        return new RollbackCheckedException();
    }

    /**
     * Create an instance of {@link GetAllEmployeesResponse }
     * 
     */
    public GetAllEmployeesResponse createGetAllEmployeesResponse() {
        return new GetAllEmployeesResponse();
    }

    /**
     * Create an instance of {@link GetAllEmployees }
     * 
     */
    public GetAllEmployees createGetAllEmployees() {
        return new GetAllEmployees();
    }

    /**
     * Create an instance of {@link DummyResponse }
     * 
     */
    public DummyResponse createDummyResponse() {
        return new DummyResponse();
    }

    /**
     * Create an instance of {@link Dummy }
     * 
     */
    public Dummy createDummy() {
        return new Dummy();
    }

    /**
     * Create an instance of {@link SystemUnavaliableException }
     * 
     */
    public SystemUnavaliableException createSystemUnavaliableException() {
        return new SystemUnavaliableException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBySurnameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.emre.com/", name = "searchBySurnameResponse")
    public JAXBElement<SearchBySurnameResponse> createSearchBySurnameResponse(SearchBySurnameResponse value) {
        return new JAXBElement<SearchBySurnameResponse>(_SearchBySurnameResponse_QNAME, SearchBySurnameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemUnavaliableException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.emre.com/", name = "SystemUnavaliableException")
    public JAXBElement<SystemUnavaliableException> createSystemUnavaliableException(SystemUnavaliableException value) {
        return new JAXBElement<SystemUnavaliableException>(_SystemUnavaliableException_QNAME, SystemUnavaliableException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DummyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.emre.com/", name = "dummyResponse")
    public JAXBElement<DummyResponse> createDummyResponse(DummyResponse value) {
        return new JAXBElement<DummyResponse>(_DummyResponse_QNAME, DummyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.emre.com/", name = "getAllEmployees")
    public JAXBElement<GetAllEmployees> createGetAllEmployees(GetAllEmployees value) {
        return new JAXBElement<GetAllEmployees>(_GetAllEmployees_QNAME, GetAllEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.emre.com/", name = "getAllEmployeesResponse")
    public JAXBElement<GetAllEmployeesResponse> createGetAllEmployeesResponse(GetAllEmployeesResponse value) {
        return new JAXBElement<GetAllEmployeesResponse>(_GetAllEmployeesResponse_QNAME, GetAllEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.emre.com/", name = "registerEmployee")
    public JAXBElement<RegisterEmployee> createRegisterEmployee(RegisterEmployee value) {
        return new JAXBElement<RegisterEmployee>(_RegisterEmployee_QNAME, RegisterEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RollbackCheckedExceptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.emre.com/", name = "rollbackCheckedExceptionResponse")
    public JAXBElement<RollbackCheckedExceptionResponse> createRollbackCheckedExceptionResponse(RollbackCheckedExceptionResponse value) {
        return new JAXBElement<RollbackCheckedExceptionResponse>(_RollbackCheckedExceptionResponse_QNAME, RollbackCheckedExceptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBySurname }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.emre.com/", name = "searchBySurname")
    public JAXBElement<SearchBySurname> createSearchBySurname(SearchBySurname value) {
        return new JAXBElement<SearchBySurname>(_SearchBySurname_QNAME, SearchBySurname.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dummy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.emre.com/", name = "dummy")
    public JAXBElement<Dummy> createDummy(Dummy value) {
        return new JAXBElement<Dummy>(_Dummy_QNAME, Dummy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.emre.com/", name = "registerEmployeeResponse")
    public JAXBElement<RegisterEmployeeResponse> createRegisterEmployeeResponse(RegisterEmployeeResponse value) {
        return new JAXBElement<RegisterEmployeeResponse>(_RegisterEmployeeResponse_QNAME, RegisterEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RollbackCheckedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.emre.com/", name = "rollbackCheckedException")
    public JAXBElement<RollbackCheckedException> createRollbackCheckedException(RollbackCheckedException value) {
        return new JAXBElement<RollbackCheckedException>(_RollbackCheckedException_QNAME, RollbackCheckedException.class, null, value);
    }

}
