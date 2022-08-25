package strategy.impl;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 25/8/22
 * Time: 3:37 p. m.
 */

public class Principal {

  private String userName;
  private String rol;

  public Principal(String userName,String rol){
    this.userName = userName;
    this.rol = rol;
  }

  // Getters and Setters

  public String getUserName(){
    return this.userName;
  }

  public void setUserName(String userName){
    this.userName = userName;
  }

  public String getRol(){
    return this.rol;
  }

  public void setRol(String rol){
    this.rol = rol;
  }

  @Override
  public String toString() {
    return "Principal: " +
        "userName:'" + userName + '\'' +
        ", rol:'" + rol + '\'';
  }
}
