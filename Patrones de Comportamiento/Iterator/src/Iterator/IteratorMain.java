package Iterator;

import Iterator.impl.Employee;
import Iterator.impl.IIterator;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 17/8/22
 * Time: 1:46 p. m.
 */

public class IteratorMain {

  public static void main(String[] args){

    Employee employee = new Employee("Juan", "CEO",
        new Employee("Pedro","Presidente",
          new Employee("Liliana","VP",
            new Employee("Oscar", "Gerente",
              new Employee("Mario","Developer"),
              new Employee("Rodolfo","Developer")),
            new Employee("Sofia", "Gerente",
              new Employee("Adrián","Sr Developer"),
              new Employee("Rebeca", "Developer")
            )
          )
        )
        );

    IIterator<Employee> empIterator = employee.createIterator();
    while(empIterator.hasNext()){
      Employee emp = empIterator.next();
      System.out.println("emp >" + emp.toString());
    }

  }

}
