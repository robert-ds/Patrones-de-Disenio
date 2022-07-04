package builder;

import builder.dto.Employee;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 4/7/22
 * Time: 3:37 p. m.
 */

public class BuilderMain {

  public static void main(String[] args){

    Employee emp = new Employee.EmployeeBuilder()
        .setName("Andres Lopez")
        .setGender("Male")
        .setAge(29)
        .setAddress("Calle Nueva", "Zara", "Venezuela", "2130")
        .addContacts("Andres Lopez", "9788862", "0416", "Casa", "Calle flores 123", "Zara", "Venezuela", "2130")
        .addContacts("Robert Vásquez", "9783221", "0426", "2130")
        .addPhones("83492832", "0426", "Celular")
        .addPhones("42942924", "0238", "Casa")
        .build();

    System.out.println(emp);
    
  }

}
