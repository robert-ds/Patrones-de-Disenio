package strategy.impl;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 25/8/22
 * Time: 3:36 p. m.
 */

public class AuthenticationProvider {

  private IAuthenticationStrategy authenticationStrategy;

  public void setAuthenticationStrategy(IAuthenticationStrategy strategy){
    this.authenticationStrategy = strategy;
  }

  public Principal authenticate(String userName, String password){
    if(authenticationStrategy == null){
      throw new RuntimeException("Estrategia de autentication no definida");
    }
    return authenticationStrategy.authenticate(userName, password);
  }

}
