package builder.dto;

import builder.IBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 4/7/22
 * Time: 3:40 p. m.
 */

public class Employee {

  private String name;
  private int age;
  private String gender;
  private Address adress;
  private List<Phone> phones;
  private List<Contact> contacts;

  private Employee(String name, int age, String gender, Address adress,List<Phone> phones, List<Contact> contacts){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.adress = adress;
    this.phones = phones;
    this.contacts = contacts;
  }

  public Employee(String name, int age, String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Employee(){}

  // GETS and SETS

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Address getAddress() {
    return adress;
  }

  public void setAddress(Address adress) {
    this.adress = adress;
  }

  public List<Phone> getPhones() {
    return phones;
  }

  public void setPhones(List<Phone> phones) {
    this.phones = phones;
  }

  public List<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", gender='" + gender + '\'' +
        ", adress=" + adress +
        ", phones=" + phones +
        ", contacts=" + contacts +
        '}';
  }

  public static class EmployeeBuilder implements IBuilder<Employee>{

    private String name;
    private int age;
    private Address adress;
    private String gender;
    private final List<Phone> phones = new ArrayList<>();
    private final List<Contact> contacts = new ArrayList<>();

    public EmployeeBuilder(){}

    public EmployeeBuilder setName(String name){
      this.name = name;
      return this;
    }

    public EmployeeBuilder setAge(int age){
      this.age = age;
      return this;
    }

    public EmployeeBuilder setGender(String gender){
      this.gender = gender;
      return this;
    }

    public EmployeeBuilder setAddress(String address, String city, String country, String cp){
      adress = new Address(address, city, country, cp);
      return this;
    }

    public EmployeeBuilder addPhones(String phoneNumber, String ext, String phoneType){
      phones.add(new Phone(phoneNumber, ext, phoneType));
      return this;
    }

    public EmployeeBuilder addContacts(String name, String phoneNumber, String ext, String phoneType, String address, String city, String country, String cp){
      contacts.add(new Contact(name, new Phone(phoneNumber, ext, phoneType), new Address(address, city, country, cp)));
      return this;
    }

    public EmployeeBuilder addContacts(String name, String phoneNumber, String ext, String phoneType){
      contacts.add(new Contact(name, new Phone(phoneNumber, ext, phoneType)));
      return this;
    }

    @Override
    public Employee build(){
      return new Employee(name, age, gender, adress, phones, contacts);
    }

  }

}

