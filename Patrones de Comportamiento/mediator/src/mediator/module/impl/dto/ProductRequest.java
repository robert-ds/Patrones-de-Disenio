package mediator.module.impl.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 6/9/22
 * Time: 4:32 p. m.
 */

public class ProductRequest {

  public List<Product> products = new ArrayList<>();

  public List<Product> getProducts(){
    return this.products;
  }

  public void setProducts(List<Product> products){
    this.products = products;
  }

}
