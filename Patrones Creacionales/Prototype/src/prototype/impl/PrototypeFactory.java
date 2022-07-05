package prototype.impl;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 5/7/22
 * Time: 2:24 p. m.
 */

public class PrototypeFactory {

  private static HashMap<String,IPrototype> prototypes = new HashMap<>();

  public static IPrototype getPrototype(String prototypeName){
    return prototypes.get(prototypeName).deepClone();
  }

  public static void addPrototype(String prototypeName, IPrototype prototype){
    prototypes.put(prototypeName,prototype);
  }

}
