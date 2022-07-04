package builder.dto;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 4/7/22
 * Time: 3:40 p. m.
 */

public class Phone {

  private String phoneNumber;
  private String ext;
  private String phoneType;

  public Phone(){}

  public Phone(String phoneNumber, String ext, String phoneType){
    this.phoneNumber = phoneNumber;
    this.ext = ext;
    this.phoneType = phoneType;
  }

  // GETTERS and SETTERS

  public String getPhoneNumber(){
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
  }

  public String getExt() {
    return ext;
  }

  public void setExt(String ext) {
    this.ext = ext;
  }

  public String getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(String phoneType) {
    this.phoneType = phoneType;
  }
}
