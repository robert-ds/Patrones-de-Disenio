package nullobject.domain;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 8/9/22
 * Time: 3:34 p. m.
 */

public class Address {

  public String fullAddress;

  public Address(String fullAddress){
    this.fullAddress = fullAddress;
  }

  public Address(){
    this.fullAddress = fullAddress;
  }

  public String getFullAddress(){
    return fullAddress;
  }

  public void setFullAddress(String fullAddress){
    this.fullAddress = fullAddress;
  }

  public static final Address NULL_ADDRESS = new Address() {

    public String getFullAddress() {
      return "Not Address";
    }

  };

}
