package objectpool.impl;

import objectpool.impl.poolable.IPooledObject;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 6/7/22
 * Time: 2:31 p. m.
 */

public interface IObjectPool<T extends IPooledObject> {
  public T getObject() throws PoolException;
  public void releaceObject(T pooledObject);
}
