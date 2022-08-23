package observer.impl.observers;

import observer.impl.ConfigurationManager;
import observer.impl.IObserver;
import java.util.Date;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 23/8/22
 * Time: 4:28 p. m.
 */

public class DateFormatObserver implements IObserver {

  @Override
  public void notifyObserver(String command, Object source) {
    if(command.equals("defaultDateFormat")){
      ConfigurationManager conf = (ConfigurationManager)source;
      System.out.println("Observer ==> DateFormatObserver.date.FormatChange > " + conf.getDefaultDateFormat().format(new Date()));
    }
  }

}
