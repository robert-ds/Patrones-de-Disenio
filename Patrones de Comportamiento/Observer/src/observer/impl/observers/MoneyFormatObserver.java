package observer.impl.observers;

import observer.impl.ConfigurationManager;
import observer.impl.IObserver;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 23/8/22
 * Time: 4:29 p. m.
 */

public class MoneyFormatObserver implements IObserver {
  @Override
  public void notifyObserver(String command, Object source) {
    if(command.equals("moneyFormat")){
      ConfigurationManager conf = (ConfigurationManager)source;
      System.out.println("Observer ==> MoneyFormatObserver.moneyFormatChange >" + conf.getMoneyFormat().format(1.11));
    }
  }
}
