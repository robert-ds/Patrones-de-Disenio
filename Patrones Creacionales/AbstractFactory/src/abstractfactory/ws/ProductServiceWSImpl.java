package abstractfactory.ws;

import abstractfactory.service.IProductsService;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 28/6/22
 * Time: 2:30 p. m.
 */

public class ProductServiceWSImpl implements IProductsService {

  private static final String[] PRODUCTS = new String[]{"Refrsco","Jugo","Fruta"};

  @Override
  public String[] getProducts() {
    System.out.println("WebService");
    return PRODUCTS;
  }
}
