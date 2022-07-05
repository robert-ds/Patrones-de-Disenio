package prototype.impl;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 5/7/22
 * Time: 2:23 p. m.
 */

public interface IPrototype< T extends IPrototype> extends Cloneable {
  public T clone();
  public T deepClone();
}
