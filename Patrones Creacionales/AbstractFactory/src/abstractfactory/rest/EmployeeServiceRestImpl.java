package abstractfactory.rest;

import abstractfactory.service.IEmployeeService;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 28/6/22
 * Time: 2:24 p. m.
 */

public class EmployeeServiceRestImpl implements IEmployeeService {

  private static final String[] EMPLOYEES = new String[]{"Juan","Manuel","Alberto"};

  @Override
  public String[] getEmployee() {
    System.out.println("RestFul");
    return EMPLOYEES;
  }
}
