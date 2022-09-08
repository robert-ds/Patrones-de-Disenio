package nullobject.dao;

import nullobject.domain.Address;
import nullobject.domain.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 8/9/22
 * Time: 3:33 p. m.
 */

public class EmployeeDAOService {

  private List<Employee> EMPLOYEE_LIST = new ArrayList<>();

  public EmployeeDAOService(){
    Employee emp1 = new Employee(1L,"Robert Vásquez", new Address("Calle liberta, avenida principal"));
    EMPLOYEE_LIST.add(emp1);
  }

  public Employee findEmployeeById(Long id){
    for(Employee emp: EMPLOYEE_LIST){
      if(emp.getId().longValue() == id.longValue()){
        return emp;
      }
    }
    return Employee.NULL_EMPLOYEE;
  }

}
