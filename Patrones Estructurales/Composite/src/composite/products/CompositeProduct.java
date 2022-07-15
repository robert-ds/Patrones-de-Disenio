package composite.products;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 15/7/22
 * Time: 2:14 p. m.
 */

public class CompositeProduct extends AbstractProduct {

  private List<AbstractProduct> products = new ArrayList<AbstractProduct>();

  public CompositeProduct(String name) {
    super(name, 0);
  }

  @Override
  public double getPrice() {
    double price = 0d;

    for(AbstractProduct child: products){
      price += child.getPrice();
    }

    return price;
  }

  @Override
  public void setPrice(double price) {
    throw new UnsupportedOperationException();
  }

  public void addProduct(AbstractProduct product){
    this.products.add(product);
  }

  public boolean removeProduct(AbstractProduct product){
    return this.products.remove(product);
  }

}
