package abstractfactory;

import abstractfactory.impl.IServiceStackAbstractFactory;
import abstractfactory.impl.ServiceStackAbstractFactory;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 28/6/22
 * Time: 2:21 p. m.
 */

public class AbstractFactoryMain {

  public static void main(String[] args){
    IServiceStackAbstractFactory factory = ServiceStackAbstractFactory.createServiceFactory();
  }

}
