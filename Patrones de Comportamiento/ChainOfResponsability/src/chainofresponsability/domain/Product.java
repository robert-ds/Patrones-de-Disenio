package chainofresponsability.domain;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:36 p. m.
 */

public class Product {
  private String name;
  private double listPrice;

  // Getters and Setters

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public double getListPrice(){
    return this.listPrice;
  }

  public void setListPrice(double listPrice){
    this.listPrice = listPrice;
  }

}
