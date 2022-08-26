package chainofresponsability.domain;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:34 p. m.
 */

public abstract class Contributor {
  private String name;
  private String rfc;
  private Status status;
  private Address address;
  private Telephone telephone;
  private CreditData creditData;

  // Getters and Setters

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getRfc(){
    return this.rfc;
  }

  public void setRfc(String rfc){
    this.rfc = rfc;
  }

  public Status getStatus(){
    return this.status;
  }

  public void setStatus(Status status){
    this.status = status;
  }

  public Address getAddress(){
    return this.address;
  }

  public void setAddress(Address address){
    this.address = address;
  }

  public Telephone getTelephone(){
    return this.telephone;
  }

  public void setTelephone(Telephone telephone){
    this.telephone = telephone;
  }

  public CreditData getCreditData(){
    return this.creditData;
  }

  public void setCreditData(CreditData creditData){
    this.creditData = creditData;
  }

}
