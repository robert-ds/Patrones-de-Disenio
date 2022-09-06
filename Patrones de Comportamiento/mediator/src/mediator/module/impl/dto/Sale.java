package mediator.module.impl.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 6/9/22
 * Time: 4:33 p. m.
 */

public class Sale {

  protected List<Product> productos = new ArrayList<>();

  public List<Product> getProductos(){
    return this.productos;
  }

  public void addProduct(Product product){
    this.productos.add(product);
  }

  public void setProductos(List<Product> productos){
    this.productos = productos;
  }

}
