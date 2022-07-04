package builder.dto;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 4/7/22
 * Time: 3:40 p. m.
 */

public class Contact {

  private String name;
  private Phone phone;
  private Address address;

  public Contact(){}

  public Contact(String name, Phone phone, Address address){
    this.name = name;
    this.phone = phone;
    this.address = address;
  }

  public Contact(String name, Phone phone){
    this.name = name;
    this.phone = phone;
  }

  // Getters and Setters

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public Phone getPhone() {
    return phone;
  }

  public void setPhone(Phone phone) {
    this.phone = phone;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Contact{" +
        "name='" + name + '\'' +
        ", phone=" + phone +
        ", address=" + address +
        '}';
  }
}
