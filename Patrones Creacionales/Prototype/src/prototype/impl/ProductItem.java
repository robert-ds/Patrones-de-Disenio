package prototype.impl;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 5/7/22
 * Time: 2:24 p. m.
 */

public class ProductItem implements IPrototype<ProductItem> {

  private String name;
  private double price;

  public ProductItem(){}

  public ProductItem(String name, double price){
    this();
    this.name = name;
    this.price = price;
  }

  // Getters and Setters

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public ProductItem clone() {
    return new ProductItem(this.name, this.price);
  }

  @Override
  public ProductItem deepClone() {
    return clone();
  }

  @Override
  public String toString() {
    return "ProductItem{" +
        "name='" + name + '\'' +
        ", price=" + price +
        '}';
  }

}
