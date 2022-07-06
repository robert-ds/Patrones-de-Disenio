package objectpool.impl.factory;

import objectpool.impl.poolable.IPooledObject;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 6/7/22
 * Time: 2:33 p. m.
 */

public interface IPoolableObjectFactory<T extends IPooledObject> {
  public T createNew();
}
