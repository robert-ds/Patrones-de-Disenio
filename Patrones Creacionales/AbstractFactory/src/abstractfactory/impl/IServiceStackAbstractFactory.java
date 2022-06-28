package abstractfactory.impl;

import abstractfactory.service.IEmployeeService;
import abstractfactory.service.IProductsService;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 28/6/22
 * Time: 2:23 p. m.
 */

public interface IServiceStackAbstractFactory {
  public IEmployeeService getEmployeeService();
  public IProductsService getProductsService();
}
