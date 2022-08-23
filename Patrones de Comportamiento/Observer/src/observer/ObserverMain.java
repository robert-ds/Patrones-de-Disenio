package observer;

import observer.impl.ConfigurationManager;
import observer.impl.observers.DateFormatObserver;
import observer.impl.observers.MoneyFormatObserver;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 23/8/22
 * Time: 4:23 p. m.
 */

public class ObserverMain {

  public static void main(String[] args){

    ConfigurationManager conf = ConfigurationManager.getInstance();

    // Valores Por Default
    conf.setDefaultDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
    conf.setMoneyFormat(new DecimalFormat("##.00"));
    System.out.println("Configuración Establecida");

    // se Establecen los Observers
    DateFormatObserver dateFormatObserver = new DateFormatObserver();
    MoneyFormatObserver moneyFormatObserver = new MoneyFormatObserver();
    conf.addObsever(dateFormatObserver);
    conf.addObsever(moneyFormatObserver);
    System.out.println("");

    // Se cambia la configuracion
    conf.setDefaultDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
    conf.setMoneyFormat(new DecimalFormat("##,#00.00"));
    System.out.println("");

    // Se realiza otro cambio en la configuracion
    conf.setDefaultDateFormat(new SimpleDateFormat("MM/yyyy/dd"));
    conf.setMoneyFormat(new DecimalFormat("###.00"));

    conf.removeObserver(dateFormatObserver);
    conf.removeObserver(moneyFormatObserver);
    System.out.println("");

    // se realiza otro cambio en la configuracion
    conf.setDefaultDateFormat(new SimpleDateFormat("MM/yyyy"));
    conf.setMoneyFormat(new DecimalFormat("###,##0.00"));

  }

}
