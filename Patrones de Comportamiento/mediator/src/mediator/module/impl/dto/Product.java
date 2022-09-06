package mediator.module.impl.dto;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 6/9/22
 * Time: 4:32 p. m.
 */

public class Product {

  private String name;

  public Product(String name){
    this.name = name;
  }

  // Getters and Setters

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

}
