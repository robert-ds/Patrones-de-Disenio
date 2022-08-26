package chainofresponsability.domain.order;

import chainofresponsability.domain.Product;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:39 p. m.
 */

public class OrderItem {

  private Product product;
  private double price;
  private float quantity;

  // Getters and Setters

  public double price(){
    return this.price;
  }
  public void setPrice(double price){
    this.price = price;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public float getQuantity() {
    return quantity;
  }

  public void setQuantity(float quantity) {
    this.quantity = quantity;
  }

  public double getTotal(){
    return price * quantity;
  }

}
