package memento;

import memento.gui.EmployeeGUI;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 7/9/22
 * Time: 3:50 p. m.
 */

public class MementoMain {

  public static void main(String[] args){
    java.awt.EventQueue.invokeLater(new Runnable(){
      public void run(){
        new EmployeeGUI().setVisible(true);
      }
    });
  }

}
