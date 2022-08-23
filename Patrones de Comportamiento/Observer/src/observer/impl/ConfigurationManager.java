package observer.impl;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 23/8/22
 * Time: 4:26 p. m.
 */

public class ConfigurationManager extends AbstractObservable {

  private SimpleDateFormat defaultDateFormat;
  private NumberFormat moneyFormat;

  private static ConfigurationManager configurationManager;

  private ConfigurationManager(){

  }

  public static ConfigurationManager getInstance(){
    if(configurationManager == null){
      configurationManager = new ConfigurationManager();
    }
    return configurationManager;
  }

  public SimpleDateFormat getDefaultDateFormat(){
    return defaultDateFormat;
  }

  public void setDefaultDateFormat(SimpleDateFormat defaultDateFormat){
    this.defaultDateFormat = defaultDateFormat;
  }

  public NumberFormat getMoneyFormat(){
    return moneyFormat;
  }

  public void setMoneyFormat(NumberFormat moneyFormat){
    this.moneyFormat = moneyFormat;
    notifyAllObservers("moneyFormat",this);
  }

}
