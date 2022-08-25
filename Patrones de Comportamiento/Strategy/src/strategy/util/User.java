package strategy.util;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 25/8/22
 * Time: 3:43 p. m.
 */

public class User {

  private String userName;
  private String password;
  private String rol;

  public User(String userName, String password, String rol){
    this.userName = userName;
    this.password = password;
    this.rol = rol;
  }

  // Getters and Setters

  public String getUserName(){
    return this.userName;
  }

  public void setUserName(String userName){
    this.userName = userName;
  }

  public String getPassword(){
    return this.password;
  }

  public void setPassword(String password){
    this.password = password;
  }

  public String getRol(){
    return this.rol;
  }

  public void setRol(String rol){
    this.rol = rol;
  }

}
