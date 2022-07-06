package objectpool.impl.poolable;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 6/7/22
 * Time: 2:36 p. m.
 */
public interface IPooledObject {
  public boolean validate();
  public void invalidate();
}
