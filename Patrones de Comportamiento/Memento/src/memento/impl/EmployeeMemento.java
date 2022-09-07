package memento.impl;

import memento.entity.Employee;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 7/9/22
 * Time: 3:57 p. m.
 */

public class EmployeeMemento {

  public Employee employee;

  public EmployeeMemento(Employee employee){
    this.employee = employee;
  }

  public Employee getMemento(){
    return employee;
  }

}
