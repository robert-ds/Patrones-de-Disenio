package chainofresponsability.domain;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:33 p. m.
 */

public class Address {
  private String address1;
  private String address2;
  private String country;
  private String CP;

  // Getters and Setters

  public String getAddress1(){
    return this.address1;
  }

  public void setAddress1(String address1){
    this.address1 = address1;
  }

  public String getAddress2(){
    return this.address2;
  }

  public void setAddress2(String address2){
    this.address2 = address2;
  }

  public String getCountry(){
    return this.country;
  }

  public void setCountry(String country){
    this.country = country;
  }

  public String getCP(){
    return this.CP;
  }

  public void setCP(String CP){
    this.CP = CP;
  }

}
