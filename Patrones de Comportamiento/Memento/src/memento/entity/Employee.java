package memento.entity;

import memento.impl.EmployeeMemento;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 7/9/22
 * Time: 3:51 p. m.
 */

public class Employee implements Cloneable {

  private String name;
  private String lastName;
  private String employeeNumber;

  public Employee(String name, String lastName, String employeeNumber){
    this.name = name;
    this.lastName = lastName;
    this.employeeNumber = employeeNumber;
  }

  public Employee(){}

  // Getter and Setters

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getLastName(){
    return this.lastName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public String getEmployeeNumber(){
    return this.employeeNumber;
  }

  public void setEmployeeNumber(String employeeNumber){
    this.employeeNumber = employeeNumber;
  }

  public EmployeeMemento createMemento(){
    try{
      return new EmployeeMemento((Employee)this.clone());
    }catch(Exception e){
      throw new RuntimeException("Error al clonar el empleado");
    }
  }

  public void restoreMemento(EmployeeMemento memento){
    Employee employee = memento.getMemento();
    this.name = employee.name;
    this.lastName = employee.name;
    this.employeeNumber = employeeNumber;
  }


}
