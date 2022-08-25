package strategy.util;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 25/8/22
 * Time: 3:42 p. m.
 */

public class OnMemoryDataBase {

  private static final HashMap<String, User> USER_MAP = new HashMap<>();

  static{
    USER_MAP.put("Robert", new User("robert","12345","Admin"));
    USER_MAP.put("Andres", new User("andres","21223","Admin"));
    USER_MAP.put("Lopez", new User("lopez","45543","Admin"));
  }

  public static User findUserByName(String name){
    return USER_MAP.get(name);
  }

}
