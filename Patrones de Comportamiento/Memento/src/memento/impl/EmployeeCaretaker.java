package memento.impl;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 7/9/22
 * Time: 3:56 p. m.
 */

public class EmployeeCaretaker {

  private int currentIndex = -1;

  private final LinkedList<EmployeeMemento> states = new LinkedList<>();

  public void addNewMemento(EmployeeMemento m){
    states.add(m);
    currentIndex++;
  }

  public EmployeeMemento getCurrentMemento(){
    return states.get(currentIndex);
  }

  public EmployeeMemento getNextMemento(){
    int newIndex = currentIndex + 1;

    if(newIndex >= states.size()){
      return null;
    }

    currentIndex = newIndex;
    return states.get(currentIndex);
  }

  public EmployeeMemento getPreviousMemento(){
    int newIndex = currentIndex - 1;

    if(newIndex <= -1 || newIndex >= states.size() -1){
      return null;
    }

    currentIndex = newIndex;
    return states.get(currentIndex);

  }

}
