package composite.products;

/**
 * Created with IntelliJ IDEA
 * Created By Robet Vásquez
 * Date: 15/7/22
 * Time: 2:14 p. m.
 */

public abstract class AbstractProduct {

  protected String name;
  protected double price;

  public AbstractProduct(String name, double price){
    super();
    this.name = name;
    this.price = price;
  }

  // Getters And Setters

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public double price(){
    return this.price;
  }

  public void setPrice(double price){
    this.price = price;
  }

}
