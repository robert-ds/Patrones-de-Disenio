package nullobject;

import nullobject.dao.EmployeeDAOService;
import nullobject.domain.Employee;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 8/9/22
 * Time: 3:30 p. m.
 */

public class NullobjectMain {

  public static void main(String[] args){
    EmployeeDAOService service = new EmployeeDAOService();
    Employee emp1 = service.findEmployeeById(1L);
    System.out.println(emp1.getAddress().getFullAddress());

    Employee emp2 = service.findEmployeeById(2L);
    System.out.println(emp2.getAddress().getFullAddress());

  }

}
