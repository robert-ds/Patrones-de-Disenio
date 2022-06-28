package abstractfactory.ws;

import abstractfactory.service.IEmployeeService;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vasquez
 * Date: 28/6/22
 * Time: 2:30 p. m.
 */
public class EmployeeServiceWSImpl implements IEmployeeService {

  private static final String[] EMPLOYEES = new String[]{"Maria","Rebeca","Liliana"};

  @Override
  public String[] getEmployee() {
    System.out.println("WebServices");
    return EMPLOYEES;
  }
}
