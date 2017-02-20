package in.co.learnjava.jaxwshelloworld.service;

import in.co.learnjava.jaxwshelloworld.model.Counter;
import in.co.learnjava.jaxwshelloworld.model.Employee;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by soumya1 on 20/02/2017.
 */

@WebService
public class GetEmployeeService {

    @WebMethod(operationName="getEmployee")
    public Employee getEmployee(Counter counter){
        Employee employee = new Employee();
        employee.setId(counter.getId());
        employee.setFirstName("Bob");
        employee.setLastName("Marley");
        employee.setAddress("India");

        return employee;
    }
}
