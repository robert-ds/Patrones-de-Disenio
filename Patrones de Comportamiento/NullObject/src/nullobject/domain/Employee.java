package nullobject.domain;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 8/9/22
 * Time: 3:34 p. m.
 */

public class Employee {

  private Long id;
  private String name;
  private Address address;

  public Employee(Long id, String name, Address address){
    this.id = id;
    this.name = name;
    this.address = address;
  }

  public Employee(){}

  // Getters and Setters

  public Long getId(){
    return this.id;
  }

  public void setId(Long id){
    this.id = id;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public Address getAddress(){
    return this.address;
  }

  public void setAddress(Address address){
    this.address = address;
  }


  public static final Employee NULL_EMPLOYEE = new Employee(){

    public Long getId(){
      return 0L;
    }

    public String getName(){
      return "UNKNOW EMPLOYEE";
    }

    public Address getAddress(){
      return Address.NULL_ADDRESS;
    }

  }

}
