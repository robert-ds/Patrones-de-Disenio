package abstractfactory.ws;

import abstractfactory.impl.IServiceStackAbstractFactory;
import abstractfactory.service.IEmployeeService;
import abstractfactory.service.IProductsService;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 28/6/22
 * Time: 2:30 p. m.
 */

public class WSServiceStackImpl implements IServiceStackAbstractFactory {

  @Override
  public IEmployeeService getEmployeeService() {
    return new EmployeeServiceWSImpl();
  }

  @Override
  public IProductsService getProductsService() {
    return new ProductServiceWSImpl();
  }
}
