package abstractfactory.rest;

import abstractfactory.service.IProductsService;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 28/6/22
 * Time: 2:25 p. m.
 */

public class ProductServiceRestImpl implements IProductsService {

  private static final String[] PRODUCTS = new String[]{"Teclado", "Monitor", "Mouse"};

  @Override
  public String[] getProducts() {
    System.out.println("RestFul");
    return PRODUCTS;
  }
}
