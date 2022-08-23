package observer.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 23/8/22
 * Time: 4:25 p. m.
 */

public abstract class AbstractObservable implements IObservable{

  private final List<IObserver> observers = new ArrayList<>();

  @Override
  public void addObsever(IObserver observer) {
    this.observers.add(observer);
  }

  @Override
  public void removeObserver(IObserver observer) {
    this.observers.remove(observer);
  }

  @Override
  public void notifyAllObserver(String command, Object source) {
    for(IObserver observer: observers){
      observer.notifyObserver(command, source);
    }
  }
}
