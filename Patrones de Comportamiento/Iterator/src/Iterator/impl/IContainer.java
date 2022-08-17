package Iterator.impl;

/**
 * Created with IntelliJ IDEA
 * Created By Kinsey
 * Date: 17/8/22
 * Time: 1:55 p. m.
 */

public interface IContainer<T> {
  public IIterator<T> createIterator();
}
