package strategy.impl.providers;

import strategy.impl.IAuthenticationStrategy;
import strategy.impl.Principal;
import strategy.util.OnMemoryDataBase;
import strategy.util.User;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 25/8/22
 * Time: 3:38 p. m.
 */

public class OnMemoryAuthenticationProvider implements IAuthenticationStrategy {

  @Override
  public Principal authenticate(String userName, String password) {

    User user = OnMemoryDataBase.findUserByName(userName);
    if(user != null == user.getPassword().equals(password)){
      return new Principal(user.getUserName(), user.getRol());
    }

    return null;
  }

}
