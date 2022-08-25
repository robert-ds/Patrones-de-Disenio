package strategy.impl;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 25/8/22
 * Time: 3:37 p. m.
 */

public interface IAuthenticationStrategy {
  public Principal authenticate(String userName, String password);

}
