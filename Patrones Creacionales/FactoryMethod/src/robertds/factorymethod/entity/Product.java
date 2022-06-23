/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/6/22
 * Time: 11:06 a. m.
 */
package robertds.factorymethod.entity;

public class Product {
  private Long idProduct;
  private String productName;
  private double price;

  public Product(Long idProduct, String productName, double price){
    this.idProduct = idProduct;
    this.productName = productName;
    this.price = price;
  }

  // Gets and Sets

  public Long getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(Long idProduct) {
    this.idProduct = idProduct;
  }

  public String getProductName(){
    return productName;
  }

  public void setProductName(String productName){
    this.productName = productName;
  }

  public double getPrice(){
    return price;
  }

  public void setPrice(double price){
    this.price = price;
  }

}
