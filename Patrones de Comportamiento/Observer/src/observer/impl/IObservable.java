package observer.impl;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 23/8/22
 * Time: 4:27 p. m.
 */

public interface IObservable {
  public void addObsever(IObserver observer);
  public void removeObserver(IObserver observer);
  public void notifyAllObservers(String command, Object source);
}
