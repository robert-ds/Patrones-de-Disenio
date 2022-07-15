package composite.products;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 15/7/22
 * Time: 2:15 p. m.
 */

public class SimpleProduct extends AbstractProduct {

  protected String brand;
  public SimpleProduct(String name, double price, String brand) {
    super(name, price);
    this.brand = brand;
  }

  //Getters and Setters

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

}
