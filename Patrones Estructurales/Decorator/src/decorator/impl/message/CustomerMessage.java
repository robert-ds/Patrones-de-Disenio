package decorator.impl.message;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 18/7/22
 * Time: 2:08 p. m.
 */

public class CustomerMessage implements IMessage {

  private String name;
  private String email;
  private String telephone;

  public CustomerMessage(String name, String password, String telephone){
    this.name = name;
    this.email = email;
    this.telephone = telephone;
  }

  @Override
  public IMessage processMessage() {
    return this;
  }

  @Override
  public String getContent() {
    return toString();
  }

  @Override
  public void setContent(String content) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public String toString() {
    return "QueryCustomerMessage{" +
        "name: '" + name + '\'' +
        ", email: '" + email + '\'' +
        ", telephone: '" + telephone + '\'' +
        '}';
  }

  //Getters and Setters

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getEmail(){
    return this.email;
  }

  public void setEmail(){
    this.email = email;
  }

  public String getTelephone(){
    return this.telephone;
  }

  public void setTelephone(String telephone){
    this.telephone = telephone;
  }

}
